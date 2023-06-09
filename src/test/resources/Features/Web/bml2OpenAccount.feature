Feature: Bank Manager Login (open account)

  @smoke
  Scenario: Manager open an account
    Given bank manager clicks on the oppen account tab
    When bank manager select newly add a customer name
    And bank manager select currency
    And bank manager click process button
    Then bank manager gets a popup notification and closes it
