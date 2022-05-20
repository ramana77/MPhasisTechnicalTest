package com.jpmorgon.steps;

import com.jpmorgon.utils.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BasePage {

    @Before
    public static void setUp() {
        BasePage base = new BasePage();
        driver=base.getDriver();
    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
