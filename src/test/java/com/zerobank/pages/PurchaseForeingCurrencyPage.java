package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseForeingCurrencyPage extends BasePage{

    @FindBy(id = "pc_currency")
    public WebElement currencyDrpdwn;

    @FindBy(id = "pc_amount")
    public WebElement amountInpt;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateBtn;
}
