package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateModule(String module){
        String  path= "//strong[contains(text(),'"+module+"')]";
        Driver.get().findElement(By.xpath(path)).click();
    }
}
