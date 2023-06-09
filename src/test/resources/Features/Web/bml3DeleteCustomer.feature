Feature: Bank Manager Login (customers)

  @smoke
  Scenario: manager delete account
    Given manager in customers page
    When manager search name
    And manager delete the account
    Then successfully account will be deleted
