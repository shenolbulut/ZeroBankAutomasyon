package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBanking extends BasePage{

    public void tabs(String tab){
        String path="//span[@class='headers'][contains(.,'"+tab+"')]";
        Driver.get().findElement(By.xpath(path)).click();
    }

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivity;
}
