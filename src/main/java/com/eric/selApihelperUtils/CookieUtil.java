package com.eric.selApihelperUtils;

import com.eric.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;

/**
 * Created by zmivukk on 6/29/2018.
 */
public class CookieUtil {
    private final static WebDriver driver;
    static {
     driver = DriverManager.getDriver();
    }

   public static void deleteAllCookies(){
        driver.manage().deleteAllCookies();
   }

}
