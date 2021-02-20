package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.FindTransactionPage;
import com.zerobank.pages.OnlineBanking;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.*;

public class FindTransactionsDef {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() throws InterruptedException {
        new AccountActivityPage().findTransaction.click();

        BrowserUtils.waitFor(2);

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) throws InterruptedException {
        Thread.sleep(2000);
        new FindTransactionPage().startDate.clear();
        new FindTransactionPage().startDate.sendKeys(fromDate);
        new FindTransactionPage().endDate.clear();
        new FindTransactionPage().endDate.sendKeys(toDate);
    }

    @When("clicks search")
    public void clicks_search() {
        new FindTransactionPage().findBtn.click();

        BrowserUtils.waitFor(2);

    }

    @Then("result table should only show transactions dates between {string} to {string}")
    public void result_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) {
    List<String> list=BrowserUtils.getElementsText(new FindTransactionPage().tableDates);
    int fromdate=Integer.parseInt(fromDate.replaceAll("-",""));
    int todate=Integer.parseInt(toDate.replaceAll("-",""));
        for (String date : list) {
            int newDate=Integer.parseInt(date.replaceAll("-",""));
            boolean flag=true;
            if(newDate>=todate || newDate<=fromdate) {flag=false; break;}
            Assert.assertTrue(flag);
        }


    }

    @Then("the result should be sorted by most recent date")
    public void the_result_should_be_sorted_by_most_recent_date() {
        List<String> actualDate= new ArrayList<>(BrowserUtils.getElementsText(new FindTransactionPage().tableDates));
        List<Integer> actualDateInteger=new ArrayList<>();
        List<Integer> sorted=new ArrayList<>();
        for (String date : actualDate) {
            actualDateInteger.add(Integer.parseInt(date.replaceAll("-","")));
            sorted.add(Integer.parseInt(date.replaceAll("-","")));
        }
        Collections.sort(sorted,Collections.reverseOrder());
        Assert.assertEquals(actualDateInteger,sorted);
    }

    @And("the result table should only not contain tansactions dated {string}")
    public void theResultTableShouldOnlyNotContainTansactionsDated(String arg0) {
    }

    @Given("the user is on {string} page")
    public void theUserIsOnPage(String tab) throws InterruptedException {
        Thread.sleep(2000);
        new OnlineBanking().tabs(tab);
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String desc) {
        new FindTransactionPage().description.sendKeys(desc);

    }

    @Then("results table should only show description containing {string}")
    public void results_table_should_only_show_description_containing(String desc) {
        List <String> descRowsText=BrowserUtils.getElementsText(new FindTransactionPage().descRows);
        for (String text : descRowsText) {
            Assert.assertTrue(text.contains(desc));
        }
    }

    @Then("results table should not show description containing {string}")
    public void results_table_should_not_show_description_containing(String desc) {
        List <String> descRowsText = BrowserUtils.getElementsText(new FindTransactionPage().descRows);
        for (String s : descRowsText) {
            Assert.assertFalse(s.contains(desc));
        }
    }
    @Then("the results table should show at least one result under {string}")
    public void the_results_table_should_show_at_least_one_result_under(String col) {
        List <WebElement> deposit=new FindTransactionPage().getDepoWith(col);
        int counter =0;
        for (WebElement s : deposit) {
            if(!s.getText().isEmpty()){
                counter++;
                break;
            }
        }
        Assert.assertTrue(counter==1);
    }

    @When("user selects type {string}")
    public void user_selects_type(String type) {
        new Select(new FindTransactionPage().typeDropdown).selectByValue(type);
    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String col) {
        List <WebElement> deposit=new FindTransactionPage().getDepoWith(col);
        int counter =0;
        for (WebElement s : deposit) {
            if(!s.getText().isEmpty()){
                counter++;
                break;
            }
        }
        Assert.assertTrue(counter==0);
    }


    @When("the user enters descripton {string}")
    public void the_user_enters_descripton(String desc) {

        new FindTransactionPage().description.sendKeys(desc);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String desc) {
        List<String> textRowsDesc=BrowserUtils.getElementsText(new FindTransactionPage().descRows);
        for(String text:textRowsDesc){
            Assert.assertTrue(text.contains(desc ));
        }
    }
    @Then("results table should not show descrriptons containing {string}")
    public void results_table_should_not_show_descrriptons_containing(String desc) {
        List<String> textRowsDesc=BrowserUtils.getElementsText(new FindTransactionPage().descRows);
        System.out.println(textRowsDesc);

        for (String text : textRowsDesc) {
            Assert.assertFalse(text.contains("desc"));
        }
    }

    @Then("the results table should show at list one result under {string}")
    public void the_results_table_should_show_at_list_one_result_under(String withDep) {
        BrowserUtils.waitFor(2);
        List<WebElement> depOrWith = new FindTransactionPage().getDepOrWith(withDep);
        System.out.println(depOrWith.get(0).getText());
        boolean flag=false;
        for(WebElement elm:depOrWith ){
           if(!elm.getText().isEmpty()){

               flag=true; break;
           }


        }
        Assert.assertTrue(flag);
    }

    @When("the user selects type {string}")
    public void the_user_selects_type(String type) {
       new Select(new FindTransactionPage().typeBttn).selectByVisibleText(type);
    }







}
