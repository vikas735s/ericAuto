package com.eric.testCases;

import com.eric.com.eric.pages.HomePage;
import com.eric.driverManager.DriverManager;
import com.eric.helperUtils.HelperUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zmivukk on 6/20/2018.
 */
public class OpenChrome extends BaseTest {
    public static WebDriver driver;

    @BeforeClass
    private static void openPage() {

        driver = DriverManager.getDriver();
    }

    @Test
    public void openLinkTest1() {
        driver.get("https://www.makemytrip.com/");
        HomePage homePage = new HomePage();

    }

    @Test
    public void openLinkTest2() {
        driver.get("https://www.makemytrip.com/");

    }

    @Test
    public void openLinkTest3() {
        driver.get("https://www.makemytrip.com/");

    }


}
