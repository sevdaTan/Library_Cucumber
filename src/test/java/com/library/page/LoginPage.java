package com.library.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {


    @FindBy(id = "inputEmail")
    public WebElement userEmailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInButton;


}
