package com.zerobank.step_definitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationDef {
    LoginPage loginPage= new LoginPage();
    AccountSummaryPage accountSummaryPage= new AccountSummaryPage();
    AccountActivityPage accountActivityPage= new AccountActivityPage();
    Select select;


    @Given("the user is	on the page")
    public void the_user_is_on_the_page() {
       Driver.get().get(ConfigurationReader.get("url"));
       new FirstPage().signBtn.click();
       loginPage.login();
       loginPage.advancedBtn.click();
       loginPage.proceedToLink.click();

    }

    @When("the	user	clicks	on	Savings	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        accountSummaryPage.savingsBtn.click();
    }

    @Then("the	Account	Activity page	should	be	displayed")
    public void the_Account_Activity_page_should_be_displayed() {
       Assert.assertTrue(Driver.get().getTitle().contains("Account Activity"));
    }

    @Then("Account	drop	down	should	have	Savings	selected")
    public void account_drop_down_should_have_Savings_selected() {
       Select select=new Select(accountActivityPage.dropdown);
       Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Savings"));

    }

    @When("the	user	clicks	on	Brokerage	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
       accountSummaryPage.brokerage.click();
    }

    @Then("Account	drop	down	should	have	Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
      Select select=new Select(accountActivityPage.dropdown);
      Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Brokerage"));
    }

    @When("the	user	clicks	on	Checking	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        accountSummaryPage.checking.click();
    }

    @Then("Account	drop	down	should	have	Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        Select select= new Select(accountActivityPage.dropdown);
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Checking"));
    }

    @When("the	user	clicks	on	Credit	card	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        accountSummaryPage.creditCart.click();
    }

    @Then("Account	drop	down	should	have	Credit	Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        Assert.assertTrue(new Select(accountActivityPage.dropdown).getFirstSelectedOption().getText().equals("Credit Card"));
    }

    @When("the	user	clicks	on	Loan	link	on	the	Account	Summary	page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        accountSummaryPage.loan.click();
    }

    @Then("Account	drop	down	should	have	Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        Assert.assertTrue(new Select(accountActivityPage.dropdown).getFirstSelectedOption().getText().equals("Loan"));
    }

}
