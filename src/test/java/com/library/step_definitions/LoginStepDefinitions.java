package com.library.step_definitions;

import com.library.page.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {

        String getUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(getUrl);
    }


    @When("the user logs in as a librarian")
    public void the_user_logs_in_as_a_librarian() {

        String userName = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        loginPage.userEmailInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();

    }

    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {

        String expectedTitle = "dashboard";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedTitle));
        String actualTitle = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue("The actual title and expected title are not same. Verification Failed!",actualTitle.contains(expectedTitle));

    }







}
