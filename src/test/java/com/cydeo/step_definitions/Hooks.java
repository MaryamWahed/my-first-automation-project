package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

    //import from io.cucumber.java not from junit

    @After
    public void tearDownScenario(Scenario scenario) throws IOException { //use the Scenario from cucumber-java

        if (scenario.isFailed()) {
            Driver.getDriver().manage().window().setSize(new Dimension(1200,1000));
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }



}
