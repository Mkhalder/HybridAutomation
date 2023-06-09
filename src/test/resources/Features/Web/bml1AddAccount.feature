Feature: Bank Manager Login (add customer)

  @smoke
  Scenario Outline: Manager adds a customer
    Given bank manager lands on the XYZ home page
    When manager clicks on the bank manager login option
    And manager clicks on the add customer tab
    And manager inserts '<firstName>' '<lastName>' and '<postCode>'
    And manager clicks on the add customer option
    Then manager gets a popup notification and closes it
    Examples:
      | firstName | lastName | postCode |
      | Manotosh  | Halder   | 1212     |