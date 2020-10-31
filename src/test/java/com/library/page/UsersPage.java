package com.library.page;

import com.library.utils.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{

    @FindBy(linkText = "Users")
    protected WebElement usersButton;

    @FindBy(id = "user_status" )
    protected WebElement statusInputBox;

    @FindBy(linkText = "INACTIVE")
    protected WebElement selectStatus;

    public void clickUsersButton(){
        BrowserUtil.wait(3);
        usersButton.click();
    }

    public void clickStatusInputBox(){
        BrowserUtil.wait(1);
        statusInputBox.click();
    }

        public void chooseStatus(){
        BrowserUtil.wait(1);
        selectStatus.findElement(By.linkText("INACTIVE")).click();
        }

}
