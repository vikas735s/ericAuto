package com.eric.com.eric.pages;

import com.eric.driverManager.DriverManager;
import com.eric.helperUtils.HelperUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by zmivukk on 6/20/2018.
 */
public abstract class  BasePage {

    public static WebDriver driver;
    public BasePage(By webLocator){
        driver = DriverManager.getDriver();
        isPageLoaded(webLocator);
    }

    private  void isPageLoaded(By webLocator){
        HelperUtils.waitForWebElementToBeDisplayed(webLocator);
    }


}
