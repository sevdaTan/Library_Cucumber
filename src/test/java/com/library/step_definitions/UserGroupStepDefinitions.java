package com.library.step_definitions;

import com.library.page.BooksPage;
import com.library.page.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserGroupStepDefinitions {

    UsersPage usersPage = new UsersPage();

    @When("user clicks on User Group")
    public void userClicksOnUserGroup() {
     usersPage.clickUserGroupBox();
    }

    @Then("user chooses {string} option")
    public void userChoosesOption(String userGroup) {
        usersPage.chooseGroup();
    }
}
