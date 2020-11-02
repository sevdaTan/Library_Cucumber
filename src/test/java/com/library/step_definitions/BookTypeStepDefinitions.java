package com.library.step_definitions;

import com.library.page.BooksPage;
import com.library.page.LoginPage;
import com.library.page.UsersPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class BookTypeStepDefinitions {

    BooksPage booksPage = new BooksPage();

    @And("user clicks on the Books tab")
    public void userClicksOnTheBooksTab() {
        booksPage.clickBooksButton();
    }

    @When("user clicks on the book categories input box")
    public void userClicksOnTheBookCategoriesInputBox() {
        booksPage.clickBookCategoryInputBox();
    }

    @Then("user chooses the book type as {string}")
    public void userChoosesTheBookTypeAs(String bookType) {
        booksPage.chooseBookType();
    }
}
