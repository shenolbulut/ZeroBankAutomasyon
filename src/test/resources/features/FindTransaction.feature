@wip

Feature: Find transaction on Activity

  Scenario: Search data range
      Given the user is	on the page
      Given the user is on "Online Banking" page on Dashboard
      Given the user is on "Account Activity" page on Online Banking page
      Given the user accesses the Find Transactions tab
      When the user enters date	range from "2012-09-01" to "2012-09-06
      And clicks search
      Then result table should only show transactions dates between "2012-09-01" to "2012-09-06"
      And the results should be sorted by most recent date
      When the user enters date	range from "2012-09-02" to "2012-09-06"
      And clicks search
      Then result table should only show transactions dates between “2012-09-02” to “2012-09-06”
      And the results table should only not contain transactions dated "2012-09-01"


    Scenario: Search description
      Given the user is	on the page
      Given the user is on "Online Banking" page on Dashboard
      Given the user is on "Account Activity" page on Online Banking page
      Given the user accesses the Find Transactions tab
      When the user enters description "ONLINE"
      And clicks search
      Then result table should only show descriptions containing "ONLINE"
      When the user enters description "OFFICE"
      And clicks search
      Then result table should only show descriptions containing "OFFICE"

    Scenario: Search description case insensitive
      Given the user is	on the page
      Given the user is on "Online Banking" page on Dashboard
      Given the user is on "Account Activity" page on Online Banking page
      Given	the user accesses the Find Transactions tab
      When the user enters description "OFFICE"
      And clicks search
      Then result table should only show descriptions containing "ONLINE"
      When the user	enters description “online”
      And clicks search
      Then result table should only show descriptions containing "ONLINE"




