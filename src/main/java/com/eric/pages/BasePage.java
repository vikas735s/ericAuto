package com.eric.pages;

import com.eric.driverManager.DriverManager;
import com.eric.selApihelperUtils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        WaitUtils.waitForWebElementToBeDisplayed(webLocator);
    }


}
