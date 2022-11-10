package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvalidLogin_StepDef {

    LoginPages loginPages = new LoginPages();

    @Given("user is on the pro-crm login page")
    public void userIsOnTheProCrmLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters invalid username {string}")
    public void user_enters_invalid_username(String string) {
        loginPages.emailInputBox.sendKeys(string);

    }
    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
        loginPages.passwordInputBox.sendKeys(string);
    }
    @When("user enters the login button")
    public void user_enters_the_login_button() {
       loginPages.loginBtn.click();
    }
    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("?login=yes"));
    }



}
