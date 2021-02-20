package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
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

    public void payBillTabs(String tab){
        String path="//a[contains(text(),'"+tab+"')]";
        Driver.get().findElement(By.xpath(path)).click();
        BrowserUtils.waitFor(1);
    }
    public void inputs(String key, String value){
        String path="//*[@id='np_new_payee_"+key+"']";
        Driver.get().findElement(By.xpath(path)).sendKeys(value);
    }

    @FindBy(id = "add_new_payee")
    public WebElement addBttn;


}
