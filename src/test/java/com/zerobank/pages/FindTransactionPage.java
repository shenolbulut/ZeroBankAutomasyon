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
    @FindBy(css = "#aa_description")
    public WebElement description;
}
