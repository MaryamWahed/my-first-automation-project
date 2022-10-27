package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDefinitions {

    LoginPages loginPages = new LoginPages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        actions.click(loginPages.emailInputBox).sendKeys(string).perform();
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
      actions.click(loginPages.passwordInputBox).sendKeys(string).perform();
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
       actions.click(loginPages.loginBtn).perform();
    }
    @Then("user should launch to the home page")
    public void user_should_launch_to_the_home_page() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login=yes"));

    }



}
