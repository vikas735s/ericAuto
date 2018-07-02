package com.eric.testCases;

import com.eric.pages.HomePage;
import com.eric.driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

/**
 * Created by zmivukk on 6/20/2018.
 */
public class BaseTest {
    public WebDriver driver = DriverManager.getDriver();
    public HomePage homePage;
    @BeforeTest
    public void openUrl(){
        driver.get("https://www.makemytrip.com/");
        homePage = new HomePage();
    }
}
