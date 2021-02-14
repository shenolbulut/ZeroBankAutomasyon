@wir
Feature: Find Transactions in Accoutn Activity

  Background:
    Given the user is	on the page
    Given the user is on "Online Banking" page on Dashboard
    Given the user is on "Account Activity" page on Online Banking page
    Given the user accesses the Find Transactions tab


  Scenario: Seacrh date range
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the result should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-02" to "2012-09-06"

  Scenario: Search description
    When the user enters descripton "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters descripton "OFFICE"
    And clicks search
    Then results table should only show descriptions containing "OFFICE"
    But results table should not show descrriptons containing "ONLINE"

  Scenario: Search description case insensitive
    When the user enters descripton "ONLINE"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"
    When the user enters descripton "online"
    And clicks search
    Then results table should only show descriptions containing "ONLINE"

  Scenario: type
    And clicks search
    Then the results table should show at list one result under "Deposit"
    Then the results table should show at list one result under "Withdrawal"
    When the user selects type "Withdrawal"
    Then clicks search
    Then the results table should show at list one result under "Withdrawal"
    But results table should show no result under "Deposit"







