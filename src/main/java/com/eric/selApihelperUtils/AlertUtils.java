package com.eric.selApihelperUtils;

import com.eric.driverManager.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * Created by zmivukk on 6/29/2018.
 */
public class AlertUtils {

    private static WebDriver driver;
    private static Alert alert;

    static {
        driver = DriverManager.getDriver();
        alert = driver.switchTo().alert();
    }

    public static void acceptAlert(){
        if(alert !=null)
        alert.accept();
        // else aletr is not present
    }

    public static void dismissAlert(){
        alert.dismiss();
    }

    public static String getText(){
        return alert.getText();
    }

    public static void sendText( String text){
        alert.sendKeys(text);
    }
}
