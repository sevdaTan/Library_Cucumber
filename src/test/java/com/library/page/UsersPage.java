package com.library.page;

import com.library.utils.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class UsersPage extends BasePage {

    @FindBy(linkText = "Users")
    protected WebElement usersButton;

    @FindBy(id = "user_status")
    protected WebElement statusInputBox;


    public void clickUsersButton() {
        BrowserUtil.wait(3);
        usersButton.click();
    }

    public void clickStatusInputBox() {
        BrowserUtil.wait(1);
        statusInputBox.click();
    }

    public void chooseStatus() {
        BrowserUtil.wait(1);
        Select selectStatus = new Select(driver.findElement(By.id("user_status")));
        selectStatus.selectByVisibleText("INACTIVE");
    }

}
