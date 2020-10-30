package com.library.step_definitions;

import com.library.page.LoginPage;
import com.library.page.UsersPage;
import com.library.utils.BrowserUtil;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatusStepDefinitions {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        String getUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(getUrl);

    }


    @Given("user clicks on the Users tab")
    public void user_clicks_on_the_book_tab() {
        usersPage.clickUsersButton();
    }


    @When("user clicks on the status input box")
    public void user_clicks_on_the_status_input_box() {
        usersPage.clickStatusInputBox();

    }

    @Then("user chooses the {string} status")
    public void user_chooses_the_status(String status) {

    }



    }

