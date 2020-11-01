package com.library.step_definitions;

import com.library.page.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookRecordsStepDefinitions {

    BooksPage booksPage = new BooksPage();

    @When("user clicks on the Show {string} record")
    public void userClicksOnTheShowRecord(String bookRecord) {
        booksPage.clickBookRecordsBox();

    }

    @Then("user is able to see the chosen amount of record")
    public void userIsAbleToSeeTheChosenAmountOfRecord() {
        booksPage.chooseBookNumber();

    }
}
