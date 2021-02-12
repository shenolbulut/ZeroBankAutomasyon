$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Accoutn Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wir"
    }
  ]
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
  "name": "the user is on \"Account Activity\" page on Online Banking page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.DynamicAccountActivityDef.the_user_is_on_page_on_Online_Banking_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Seacrh date range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wir"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "result table should only show transactions dates between \"2012-09-01\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.result_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the result should be sorted by most recent date",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.the_result_should_be_sorted_by_most_recent_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.the_user_enters_date_range_from_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "result table should only show transactions dates between \"2012-09-02\" to \"2012-09-06\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.FindTransactionsDef.result_table_should_only_show_transactions_dates_between_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});