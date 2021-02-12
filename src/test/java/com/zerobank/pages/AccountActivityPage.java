package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement dropdown;
    @FindBy(xpath = "//table//th")
    public List<WebElement> transactionTable;
    @FindBy(xpath = "//*[@href='#ui-tabs-2']")
    public WebElement findTransaction;

}
