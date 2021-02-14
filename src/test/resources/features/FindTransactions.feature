
Feature: Find Transactions in Accoutn Activity

  Background:
    Given the user is	on the page
    Given the user is on "Account Activity" page
    Given the user accesses the Find Transactions tab

  Scenario: Seacrh date range
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the result should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then result table should only show transactions dates between "2012-09-02" to "2012-09-06"
    #And the result table should only not contain tansactions dated "2012-09-01"

  Scenario: Search description
    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show description containing "ONLINE"
    When the user enters description "OFFICE"
    And clicks search
    Then results table should only show description containing "OFFICE"
    But results table should not show description containing "ONLINE"

  Scenario: Search description case insensetive
    When the user enters description "ONLINE"
    And clicks search
    Then results table should only show description containing "ONLINE"
    When the user enters description "online"
    And clicks search
    Then results table should only show description containing "ONLINE"
  @wip
  Scenario: Type
    And clicks search
    Then the results table should show at least one result under "Deposit"
    Then the results table should show at least one result under "Withdrawal"
    When user selects type "Withdrawal"
    Then the results table should show at least one result under "Withdrawal"
    But results table should show no result under "Deposit"






