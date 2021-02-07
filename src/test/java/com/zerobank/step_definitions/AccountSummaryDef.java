package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryDef {
    @Then("verify Account Summary page is displayed")
    public void verify_Account_Summary_page_is_displayed() {
        String expextetTitle="Zero - Account Summary";
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expextetTitle,actualTitle);
    }

    @Then("verify all count types is displayed")
    public void verify_all_count_types_is_displayed(List<String> accontTypes) {
        List<WebElement> elements = Driver.get().findElements(By.cssSelector(".board-header"));
        List<String> elementsText=BrowserUtils.getElementsText(elements);
        Assert.assertEquals(accontTypes,elementsText);
    }

    @Then("verfiy Credit Accont table has below list")
    public void verfiy_Credit_Accont_table_has_below_list(List<String> creditCardTypes) {
    List<String> actualList=BrowserUtils.getElementsText(new AccountSummaryPage().creditAccountTable);
    Assert.assertEquals(creditCardTypes,actualList);
    }

}
