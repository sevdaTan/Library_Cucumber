package com.library.step_definitions;

import com.library.utils.BrowserUtil;
import com.library.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {



    @Before
    public void setUp() {


        System.out.println("Start automation");
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void driverDown() {

        BrowserUtil.wait(5);
        Driver.closeDriver();
        System.out.println("Automation is completed!!");

    }
}