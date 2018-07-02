package com.eric.helperUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by zmivukk on 6/25/2018.
 */
public class SelectUtils {

    private static Select select = null;
    //private static WebDriver driver;
    private static void initSelectObj(WebElement webElement){
        select = new Select(webElement);
            }
    public static void selectUsingValue( String value, WebElement webElement){
        initSelectObj(webElement);
        select.selectByValue(value);
    }
    public static void selectUsingText(String text, WebElement webElement){
        initSelectObj(webElement);
        select.selectByVisibleText(text);
    }

    public static void selectUsingIndex(int index, WebElement webElement){
        initSelectObj(webElement);
        select.selectByIndex(index);
    }

    public static void deSelectUsingIndex(int index, WebElement webElement){
        initSelectObj(webElement);
        select.deselectByIndex(index);
    }

    public static void deSelectUsingValue(String value, WebElement webElement){
        initSelectObj(webElement);
        select.deselectByValue(value);
    }

    public static void deSelectUsingText(String text, WebElement webElement){
        initSelectObj(webElement);
        select.selectByVisibleText(text);
    }

    public static void deSelectAll(WebElement webElement){
        initSelectObj(webElement);
        select.deselectAll();
    }

    public static List<WebElement> getAllOptions(WebElement webElement){
        initSelectObj(webElement);
        return select.getOptions();
    }


}
