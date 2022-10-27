package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setupScenario(){
        System.out.printf("====Setting up browser using cucumber @Before");
    }

    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.printf("====this will only apply to scenarios with @login tag");
    }

    @Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.printf("====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(){
        System.out.printf("====Closing browser using cucumber @After");
        System.out.printf("====Scenario ended/ Take screenshot if failed");
    }

    @BeforeStep
    public void setupStep(){
        System.out.printf("-------->applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.printf("--------->applying tearDown using AfterStep");
    }

}
