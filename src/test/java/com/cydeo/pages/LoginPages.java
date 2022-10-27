package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LoginPages {

    public LoginPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[4]")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    public WebElement loginBtn;


}
