package com.library.page;

import com.library.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersButton;

    @FindBy(id = "user_status" )
    public WebElement statusInputBox;

    @FindBy(linkText = "INACTIVE")
    public WebElement selectStatus;

    public void clickUsersButton(){
        BrowserUtil.wait(3);
        usersButton.click();
    }

    public void clickStatusInputBox(){
        BrowserUtil.wait(1);
        statusInputBox.click();
    }



}
