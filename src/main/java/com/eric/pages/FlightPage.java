package com.eric.pages;

import com.eric.selApihelperUtils.ActionsUtils;
import com.eric.selApihelperUtils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by zmivukk on 6/21/2018.
 */
public class FlightPage extends BasePage {
    public FlightPage() {
        super(By.xpath(".//a[@href = '//www.makemytrip.com/flights/']"));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hp-widget__sfrom")
    private WebElement fromCityTextBox;

    @FindBy(id = "hp-widget__sTo")
    private WebElement toCityTextBox;


    @FindBy(xpath = ".//*[@id='ui-id-1']//*[contains(text(), 'Pune')]")
    private WebElement fromCityOption;

    @FindBy(xpath = ".//*[@id='ui-id-2']//*[contains(text(), 'Indore')]")
    private WebElement toCityOption;


    @FindBy(id = "searchBtn")
    private WebElement serachButton;

    public void setFromCity( String city){


        fromCityTextBox.click();
        fromCityTextBox.clear();
        fromCityTextBox.sendKeys(city);
        WaitUtils.waitForAjaxCallToFinish();
        fromCityOption.click();
    }

    public void setToCity(String city){
        toCityTextBox.click();
        toCityTextBox.clear();
        toCityTextBox.sendKeys(city);
        WaitUtils.waitForAjaxCallToFinish();
        toCityOption.click();
    }

    public void sendCap(String city){
        ActionsUtils.keyDownAction(toCityTextBox, city);
    }

}
