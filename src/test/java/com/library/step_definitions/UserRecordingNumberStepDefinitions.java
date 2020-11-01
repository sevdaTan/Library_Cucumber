package com.library.step_definitions;

import com.library.page.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRecordingNumberStepDefinitions {

    UsersPage userPage = new UsersPage();

    @When("user clicks on  Show {string} record")
    public void userClicksOnShowRecord(String recordingNumber) {
        userPage.clickUsersRecordsBox();

    }

    @Then("user is able to see the chosen amount of record on the box")
    public void userIsAbleToSeeTheChosenAmountOfRecordOnTheBox() {
        userPage.chooseUsersNumber();

    }
}
