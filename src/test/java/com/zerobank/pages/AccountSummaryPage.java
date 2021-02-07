package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage   {

    @FindBy(xpath = "//tbody/tr/td[1]/a")
    public WebElement savingsBtn;

    @FindBy(xpath = "(//tbody)[2]/tr/td/a")
    public WebElement brokerage;

    @FindBy(xpath = "(//tbody)[3]/tr/td/a")
    public WebElement checking;

    @FindBy(xpath = "(//tbody)[3]/tr[2]/td/a")
    public WebElement creditCart;

    @FindBy(xpath = "(//tbody)[4]/tr/td/a")
    public WebElement loan;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public List<WebElement> creditAccountTable;
}
