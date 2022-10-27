package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println();
    }
    @When("user enters HR username")
    public void user_enters_hr_username() {
        System.out.println("User enters HR username");

    }
    @And("user enters HR password")
    public void user_enters_hr_password() {
        System.out.println("User enters HR password");

    }
    @Then("user should launch to the home page")
    public void user_should_launch_to_the_home_page() {
        System.out.println("user should launch to the home page");
    }


    @When("user enters Marketing username")
    public void user_enters_marketing_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user enters Marketing password")
    public void user_enters_marketing_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("user enters Helpdesk username")
    public void user_enters_helpdesk_username() {
        System.out.println("user enters Helpdesk username");
    }
    @When("user enters Helpdesk password")
    public void user_enters_helpdesk_password() {
        System.out.println("user enters Helpdesk password");
    }



}
