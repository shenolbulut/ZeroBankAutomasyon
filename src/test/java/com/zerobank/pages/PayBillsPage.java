package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(id = "sp_amount")
    public WebElement amountButton;

    @FindBy(id = "sp_date")
    public WebElement dateBtn;

    @FindBy(id = "pay_saved_payees")
    public WebElement payBtn;

    @FindBy(id = "alert_content")
    public WebElement message;
}
