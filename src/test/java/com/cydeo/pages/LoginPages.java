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

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[1]/input")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[1]/div[2]/input")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginBtn;


}
