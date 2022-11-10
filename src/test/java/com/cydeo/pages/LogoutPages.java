package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPages {

    public LogoutPages(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//*[@id=\"user-block\"]")
    public WebElement userBlock;

    @FindBy(xpath = "//span[contains(text(), \"Log out\")]")
    public WebElement logoutBtn;



}
