package com.eric.helperUtils;

import com.eric.driverManager.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

/**
 * Created by zmivukk on 6/25/2018.
 */
public class ActionsUtils {

    private static Actions actions;
    private static WebDriver driver = DriverManager.getDriver();

    static {
        actions = new Actions(driver);
    }

    public static void clickAction(WebElement webElement) {
        actions.moveToElement(webElement).click().build().perform();
    }

    public static void keyDownAction(WebElement webElement, String value) {

       actions.dragAndDrop(webElement, webElement).build().perform();

    }


}
