package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransactionPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

import java.util.*;

public class FindTransactionsDef {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new AccountActivityPage().findTransaction.click();
        BrowserUtils.waitFor(1);
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
        new FindTransactionPage().startDate.sendKeys(fromDate);
        new FindTransactionPage().endDate.sendKeys(toDate);
    }

    @When("clicks search")
    public void clicks_search() {
        new FindTransactionPage().findBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("result table should only show transactions dates between {string} to {string}")
    public void result_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {
        List<String> actualDates= BrowserUtils.getElementsText(new FindTransactionPage().tableDates);
        System.out.println(fromDate+toDate);
        int fromdts=Integer.parseInt(fromDate.replaceAll("-",""));
        int toDts=Integer.parseInt(toDate.replaceAll("-",""));
        for(String actualDate: actualDates){
            int actualDt=Integer.parseInt(actualDate.replaceAll("-",""));
            boolean flag=true;
            System.out.println(actualDt);
            if(actualDt>=toDts || actualDt<=fromdts) {flag=false; break;}
            Assert.assertTrue(flag);
        }

    }

    @Then("the result should be sorted by most recent date")
    public void the_result_should_be_sorted_by_most_recent_date() {
        List<String> actualDates=BrowserUtils.getElementsText(new FindTransactionPage().tableDates);
        List<Integer> dates=new ArrayList<>();
        List<Integer> sortedDates=new ArrayList<>();
        for(int i=0; i<actualDates.size(); i++){
            dates.add(Integer.parseInt(actualDates.get(i).replaceAll("-","")));
            sortedDates.add(Integer.parseInt(actualDates.get(i).replaceAll("-","")));

            System.out.println(dates);

        }
        Collections.sort(sortedDates,Collections.reverseOrder());
        System.out.println("sorted dates: "+sortedDates);
        Assert.assertEquals(dates, sortedDates);

    }

    @And("the result table should only not contain tansactions dated {string}")
    public void theResultTableShouldOnlyNotContainTansactionsDated(String arg0) {
    }
}
