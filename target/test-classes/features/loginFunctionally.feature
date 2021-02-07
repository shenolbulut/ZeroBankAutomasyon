Feature: login functionaly
  Scenario: unautorized user cannot be login
    Given the user goes to first page
    When the user clicks the sign button and verify the login page is displayed
    Then the user puts invalid credentials on login page
    |username1|asdfa|
    |password1|asdfa|
    |username2|1231|
    |password2|453|
    |username3|adfsdjl|
    |password3|lkjtlj|
    |username4|username|
    |password4|qerer|
    |username5|asdff|
    |password5|password|

    And verify Login and or password are wrong message is displayed
