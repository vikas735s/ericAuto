package com.eric.selApihelperUtils;

import com.eric.driverManager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmivukk on 6/20/2018.
 */
public class WaitUtils {
    private static WebDriver driver;
    private static WebDriverWait waitExplict;
    private static JavascriptExecutor jSE;

    static {
        driver = DriverManager.getDriver();
        waitExplict = new WebDriverWait(driver, 30);
        jSE = (JavascriptExecutor) driver;
    }

    public static boolean waitForWebElementToBeDisplayed(By webLocator) {
        if (waitExplict.until(ExpectedConditions.visibilityOfElementLocated(webLocator)) != null) {
            //jSE.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(webLocator));
            return true;
        }
        return false;
    }

    public static boolean waitForWebElementToBeDisplayed(WebElement webElement) {
        if (waitExplict.until(ExpectedConditions.visibilityOf(webElement)) != null)
            return true;
        return false;
    }

    public static void implicitWait( WebDriver driver, long time ){
        driver.manage().timeouts().implicitlyWait(TimeUnit.MILLISECONDS.convert(time, TimeUnit.MILLISECONDS) , TimeUnit.MILLISECONDS);
    }

    public static boolean waitForAjaxCallToFinish() {
        long endTime = System.currentTimeMillis() + 30000;
        boolean callCompleted = false;
        while (endTime > System.currentTimeMillis()) {
            if ((Boolean) jSE.executeScript("return jQuery.active == 0")) {
                callCompleted = true;
                return callCompleted;
            }

        }
        return callCompleted;
    }

}
