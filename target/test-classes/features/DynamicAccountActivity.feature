
Feature: Dynamicly navigating to specific accounts in Accounts Activity

  Scenario: Verifying activity page dropdown
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    Then the user is on "Account Summary" page on Online Banking page
    And click from the list on Account Summary page
    |Savings|
    |Brokerage|
    |Checking|
    |Credit Card|
    |Loan|
    Then the	Account	Activity page	should	be	displayed
    #And verify dropdown options "Loan" is selectedon the Account Activity page
  Scenario: Verifying activity page dropdown options and Transactions colums
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    Then the user is on "Account Activity" page on Online Banking page
    And verify dropdown list on Account Summary page
      |Savings|
      |Checking|
      |Savings|
      |Loan|
      |Credit Card|
      |Brokerage|
    Then the	Account	Activity page	should	be	displayed
    And verify Transaction colums as below list
    |Date|
    |Description|
    |Deposit    |
    |Withdrawal |

