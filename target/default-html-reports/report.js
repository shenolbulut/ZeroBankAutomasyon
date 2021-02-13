$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating\tto\tspecific\taccounts\tin\tAccounts\tActivity",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is\ton the page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityNavigationDef.the_user_is_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Loan\taccount\tredirect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the\tuser\tclicks\ton\tLoan\tlink\ton\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityNavigationDef.the_user_clicks_on_Loan_link_on_the_Account_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the\tAccount\tActivity page\tshould\tbe\tdisplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityNavigationDef.the_Account_Activity_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account\tdrop\tdown\tshould\thave\tLoan selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityNavigationDef.account_drop_down_should_have_Loan_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});