package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPages;
import com.cydeo.pages.LogoutPages;
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

    LogoutPages logoutPages = new LogoutPages();

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
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertTrue(actualTitle.contains("Portal")||actualTitle.contains("EULA"));


    }


    @And("user clicks logout button")
    public void userClicksLogoutButton() {
        actions.click(logoutPages.userBlock).perform();
        actions.click(logoutPages.logoutBtn).perform();
    }

    @And("user clicks step back button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user should not see home page")
    public void userShouldNotSeeHomePage() {
        String loginPageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle, loginPageTitle);
        Driver.closeDriver();
    }


    @And("user closes the open browser")
    public void userClosesTheOpenBrowser() {
        Driver.closeDriver();
    }


    @Then("user should end up on the login page")
    public void userShouldEndUpOnTheLoginPage() {
        String loginPageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle,loginPageTitle);
    }
}
