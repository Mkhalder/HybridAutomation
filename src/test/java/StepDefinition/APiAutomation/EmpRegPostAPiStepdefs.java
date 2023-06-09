package StepDefinition.APiAutomation;

import Core.APiCall;
import Core.DBManager;
import Core.FileHandleHelper;
import Core.HeaderFormatHelper;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import repository.localRepo.dbModel.PostApidbModel;
import repository.remoteRepo.requestRepo.EmpRegPostRequestModel;
import repository.remoteRepo.responsRepo.EmpRegPostResponseModel;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Core.CoreConstrainHelper.base_url;
import static Core.FilePathHelper.postApiPath;


public class EmpRegPostAPiStepdefs {
    private Gson gson = new Gson();

    private String requestModel;
    Response postAPiResponse;
    EmpRegPostRequestModel empRegPostRequestModel;



    String url;

    @Given("register has the api  {string}")
    public void registerHasTheApiPath(String path) {
        url = base_url + path;

    }

    @When("register hit {string} and {string}")
    public void registerHitEmailAndPassword(String email, String password) {
        JSONObject requestBody = new FileHandleHelper().readJsonFile(postApiPath);
        empRegPostRequestModel = new Gson().fromJson(requestBody.toJSONString(), EmpRegPostRequestModel.class);
        empRegPostRequestModel.setEmail(email);
        empRegPostRequestModel.setPassword(password);
        requestModel = gson.toJson(empRegPostRequestModel);


    }

    @And("call the api with body")
    public void callTheApiWithBody() {
        postAPiResponse = APiCall.postCall(HeaderFormatHelper.commonHeaders(), requestModel, url);
        System.out.println(postAPiResponse.body().asString());


    }

    @Then("it will return token")
    public void itWillReturnToken() throws SQLException, ClassNotFoundException {
        EmpRegPostResponseModel empRegPostResponseModel = gson.fromJson(postAPiResponse.getBody().asString(), EmpRegPostResponseModel.class);
        System.out.println(empRegPostResponseModel.getId());
        System.out.println(empRegPostResponseModel.getToken());

        //______________________ DataBase----------------------------//

        ResultSet rs = DBManager.executeQueries("select * from qa_test.api limit 1");
        while (rs.next()) {
            PostApidbModel postApidbModel= new PostApidbModel();

            postApidbModel.setId(rs.getInt("id"));
            postApidbModel.setJob(rs.getString("name"));
            postApidbModel.setName(rs.getString("job"));
            System.out.println(postApidbModel.getId());
            System.out.println(postApidbModel.getJob());
            System.out.println(postApidbModel.getName());


            //System.out.println(rs.getString(2));


        }
    }
}
