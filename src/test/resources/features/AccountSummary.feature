Feature: Account Summary page automation


  Scenario: verifinng account types
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    Then the user is on "Account Summary" page on Online Banking page
    Then verify Account Summary page is displayed
    And verify all count types is displayed
      |Cash Accounts|
      |Investment Accounts|
      |Credit Accounts|
      |Loan Accounts|
    And verfiy Credit Accont table has below list
    |Account|
    |Credit Card|
    |Balance|