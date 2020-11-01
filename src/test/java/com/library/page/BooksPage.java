package com.library.page;

import com.library.utils.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BooksPage extends BasePage {

    @FindBy(linkText = "Books")
    protected WebElement booksButton;

    @FindBy(id = "book_categories")
    protected WebElement booksInputBox;


    public void clickBooksButton() {
        BrowserUtil.wait(3);
        booksButton.click();
    }

    public void clickBookCategoryInputBox() {
        BrowserUtil.wait(1);
        booksInputBox.click();
    }

    public void chooseBookType() {
        BrowserUtil.wait(1);
        Select selectBookType = new Select(driver.findElement(By.id("book_categories")));
        selectBookType.selectByVisibleText("Crime and Detective");
    }

}
