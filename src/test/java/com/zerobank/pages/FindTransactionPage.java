package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindTransactionPage extends BasePage{
    @FindBy(css = "#aa_fromDate")
    public WebElement startDate;
    @FindBy(css = "#aa_toDate")
    public WebElement endDate;

    @FindBy(css = ".btn.btn-primary")
    public WebElement findBtn;

    @FindBy(xpath = "(//table[@class='table table-condensed table-hover'])[2]//tbody/tr/td[1]")
    public List<WebElement> tableDates;

    @FindBy(xpath = "(//tbody)[2]/tr/td[2]")
    public List<WebElement> descRows;
    @FindBy(css = "#aa_description")
    public WebElement description;


    @FindBy(xpath = "(//tbody)[2]/tr/td[3]")
    public List<WebElement> Deposit;
    @FindBy(xpath = "(//tbody)[2]/tr/td[4]")
    public List<WebElement> Withdrawal;

    public List<WebElement> getDepOrWith(String key) {
        if (key.equalsIgnoreCase("Deposit")) {
            return this.Deposit;
        } else if (key.equalsIgnoreCase("Withdrawal")) {
            return this.Withdrawal;
        }
        return null;
    }

    @FindBy(css = "#aa_type")
    public WebElement typeBttn;



    @FindBy(xpath = "(//tbody)[2]/tr/td[3]")
    public List<WebElement> depositList;

    @FindBy(xpath = "(//tbody)[2]/tr/td[4]")
    public List<WebElement> withdrawalList;

    @FindBy(css = "#aa_type")
    public WebElement typeDropdown;

    public List<WebElement> getDepoWith(String key){
        if(key.equals("Deposit")){
            return  depositList;
        }else if(key.equals("Withdrawal")){
            return  withdrawalList;
        }
        return null;
    }

}
