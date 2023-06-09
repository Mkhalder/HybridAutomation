package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Elements {

    public static WebDriver driver;

    public Elements(WebDriver driver) {

        this.driver = driver;
    }

    public void managerClicksOnTheBankManagerLoginOption()  {
        driver.findElement(By.xpath("//button[@ng-click=\"manager()\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void managerClicksOnTheAddCustomerTab(){
        driver.findElement(By.xpath("//button[@ng-click=\"addCust()\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void managerInsertsFirstNameLastNameAndPostCode(String firstName, String lastName, String postCode) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastName);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Post Code\"]")).sendKeys(postCode);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    public void managerClicksOnTheAddCustomerOption() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
        Thread.sleep(2000);

    }

    public void managerGetsAPopupNotificationAndClosesIt(){
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage = alert.getText(); // capture alert message

        System.out.println(alertMessage);

        alert.accept();
    }
    //------------------------ Open Account Page--------------------------------------------------------------
    public void bankManagerClicksOnTheOppenAccountTab() throws InterruptedException {
        driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).click();
        Thread.sleep(2000);
    }

    public void bankManagerSelectNewlyAddACustomerName() throws InterruptedException {
        driver.findElement(By.xpath("//select[@name='userSelect']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select//option[text()='Manotosh Halder']")).click();
        Thread.sleep(2000);

    }

    public void bankManagerSelectCurrency() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='currency']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select//option[text()='Dollar']")).click();
        Thread.sleep(2000);
    }

    public void bankManagerClickProcessButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
    }

    public void bankManagerGetsAPopupNotificationAndClosesIt() {
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage = alert.getText(); // capture alert message

        System.out.println(alertMessage);

        alert.accept();
    }
    //----------------------------- Customers Page------------------------------------------------------
    public void managerInCustomersPage() throws InterruptedException {

        driver.findElement(By.xpath("//button[@ng-click=\"showCust()\"]")).click();
        Thread.sleep(2000);

    }

    public void managerSearchName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder=\"Search Customer\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"Search Customer\"]")).sendKeys("Manotosh");
        Thread.sleep(2000);
    }

    public void managerDeleteTheAccount() throws InterruptedException {
        driver.findElement(By.xpath("//button[@ng-click=\"deleteCust(cust)\"]")).click();
        Thread.sleep(2000);
    }
    public void successfullyAccountWillBeDeleted() throws InterruptedException {
        driver.findElement(By.xpath("//button[@ng-click=\"home()\"]")).click();//// will be ok?
        Thread.sleep(2000);

    }
}
