@wir
Feature: Find Transactions in Accoutn Activity

  Background:
    Given the user is	on the page
    Given the user is on "Online Banking" page on Dashboard
    Given the user is on "Account Activity" page on Online Banking page

  Scenario: Seacrh date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the result should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-02" to "2012-09-06"
    #And the result table should only not contain tansactions dated "2012-09-01"


