package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DynamicAccountActivityDef {
    @When("the user is on {string} page on Dashboard")
    public void the_user_is_on_page_on_Dashboard(String module) {

        String  path= "//strong[contains(text(),'"+module+"')]";
        Driver.get().findElement(By.xpath(path)).click();

    }

    @Then("the user is on {string} page on Online Banking page")
    public void the_user_is_on_page_on_Online_Banking_page(String tabModule) {

        String path="//span[@class='headers'][contains(.,'"+tabModule+"')]";
        Driver.get().findElement(By.xpath(path)).click();
    }


    @Then("click from the list on Account Summary page")
    public void click_from_the_list_on_Account_Summary_page(List<String> accounts) {
        int counter=0;
        System.out.println(accounts.toString());
        for (String account: accounts){
            String path="//*[@style='text-decoration: underline'][contains(.,'"+account+"')]";
            Driver.get().findElement(By.xpath(path)).click();
            BrowserUtils.waitFor(3);
            Assert.assertEquals(account, new Select(new AccountActivityPage().dropdown).getFirstSelectedOption().getText());
            Driver.get().navigate().back();
            counter++;
            BrowserUtils.waitFor(3);
        }

        System.out.println(counter);
    }

    @Then("verify dropdown options {string} is selectedon the Account Activity page")
    public void verify_dropdown_options_is_selectedon_the_Account_Activity_page(List<String> dropdownText) {
        Assert.assertEquals(dropdownText, new Select(new AccountActivityPage().dropdown).getFirstSelectedOption().getText());
    }

    @Then("verify dropdown list on Account Summary page")
    public void verify_dropdown_list_on_Account_Summary_page(List<String> dropdown) {
        Select select=new Select(new AccountActivityPage().dropdown);
        List<String> actualDropdown=BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(dropdown,actualDropdown);
    }

    @Then("verify Transaction colums as below list")
    public void verify_Transaction_colums_as_below_list(List<String> transactionTable) {
        List<String> actualTransTable=BrowserUtils.getElementsText(new AccountActivityPage().transactionTable);
        Assert.assertEquals(transactionTable,actualTransTable);
    }

}
