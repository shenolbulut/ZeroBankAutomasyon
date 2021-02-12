


Feature: navigate to Pay Bill page
  Scenario: navigate Pay Bill page
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    When the user is on "Pay Bills" page on Online Banking page
    Then verify the Pay Bill page is displayed

  Scenario: sending money positive
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    When the user is on "Pay Bills" page on Online Banking page
    Then input the money on amount button
    Then input the date on the date button
    Then click the pay button
    And verify The payment was successfully submitted message is displayed
  Scenario: sending money negative
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    When the user is on "Pay Bills" page on Online Banking page
    Then input the money on amount button
    Then click the pay button
    And verify lutfen bu alani doldurun message is displayed

  Scenario: sending money negative
    Given the user is	on the page
    When the user is on "Online Banking" page on Dashboard
    When the user is on "Pay Bills" page on Online Banking page
    Then input the date on the date button
    Then click the pay button
    And verify lutfen bu alani doldurun message is displayed



