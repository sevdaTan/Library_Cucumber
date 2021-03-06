package com.library.page;


import com.library.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@id='inputEmail']")
    protected WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='inputPassword']")
    protected WebElement passwordInput;

    @FindBy(xpath="//button[@type='submit']")
    protected WebElement signInButton;

    public void login(){
        String librarian_email = ConfigurationReader.getProperty("librarian_email");
        String librarian_password = ConfigurationReader.getProperty("librarian_password");
        userEmailInput.sendKeys(librarian_email);
        passwordInput.sendKeys(librarian_password);
        signInButton.click();
    }


}
