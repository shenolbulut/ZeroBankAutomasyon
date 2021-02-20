$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeingCurrency.feature");
formatter.feature({
  "name": "Purcahse Foreign Currency",
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
formatter.step({
  "name": "the user is on \"Online Banking\" page on Dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.DynamicAccountActivityDef.the_user_is_on_page_on_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on \"Pay Bills\" page on Online Banking page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.DynamicAccountActivityDef.the_user_is_on_page_on_Online_Banking_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"Purchase Foreign Currency\" tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsDef.the_user_is_on_the_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message for not entering value",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user tries to calculate cost without entering a value",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PurchaseFroreingCurrecyDef.user_tries_to_calculate_cost_without_entering_a_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PurchaseFroreingCurrecyDef.error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});