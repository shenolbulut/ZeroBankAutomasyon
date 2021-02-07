$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBillsNavigation.feature");
formatter.feature({
  "name": "navigate to Pay Bill page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "sending money negative",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
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
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.DynamicAccountActivityDef.the_user_is_on_page_on_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on \"Pay Bills\" page on Online Banking page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.DynamicAccountActivityDef.the_user_is_on_page_on_Online_Banking_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input the money on amount button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsDef.input_the_money_on_amount_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the pay button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsDef.click_the_pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify lutfen bu alani doldurun message is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsDef.verify_lutfen_bu_alani_doldurun_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});