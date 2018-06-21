package com.eric.testCases;

import com.eric.com.eric.pages.BasePage;
import com.eric.com.eric.pages.FlightPage;
import com.eric.com.eric.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by zmivukk on 6/21/2018.
 */
public class FlightTest extends BaseTest {
    FlightPage flightPage;

    @BeforeClass
    public void OpenFlightTab(){
        homePage.clickFlightTabLink();
        flightPage = new FlightPage();
    }

    @Test
    public void flightTest1(){
        flightPage.setFromCity("Pune");

        flightPage.setToCity("Indore");

    }

}
