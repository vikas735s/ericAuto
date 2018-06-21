package com.eric.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by zmivukk on 6/20/2018.
 */
public class DriverManager {
    static   WebDriver driver = null;

    public  static WebDriver getDriver(){
        if(driver ==null){
            setBrowserProperties();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void setBrowserProperties(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\drivers\\chromedriver.exe");
    }

}
