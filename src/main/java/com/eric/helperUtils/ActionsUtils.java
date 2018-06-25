package com.eric.helperUtils;

import com.eric.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by zmivukk on 6/25/2018.
 */
public class ActionsUtils {

    private static Actions actions;
    private static WebDriver driver = DriverManager.getDriver();
    static {
        actions = new Actions(driver);
    }





}
