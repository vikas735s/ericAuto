package com.eric.com.eric.pages;

import com.eric.driverManager.DriverManager;
import com.eric.helperUtils.HelperUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by zmivukk on 6/20/2018.
 */
public class HomePage extends BasePage{

    @FindBy(id = "header_tab_flights")
    private WebElement flightTabLink;

    public HomePage(){
        super(By.xpath(".//*[@class='mmt_header_logo']"));
        PageFactory.initElements(driver, this);
    }

    public void clickFlightTabLink(){
        flightTabLink.click();
        HelperUtils.waitForAjaxCallToFinish();
    }

}
