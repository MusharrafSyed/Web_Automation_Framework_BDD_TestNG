package stepdefinations;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    @Given("User enters valid username")
    public void user_enters_valid_username() {
    loginPage = new LoginPage(Hooks.driver);
    loginPage.enterUserName("Admin");

    }

    @Given("user enters valid password")
    public void user_enters_valid_password() {
    loginPage.enterPassword("admin123");
    }

    @Given("user click on Login button")
    public void user_click_on_login_button() {
        loginPage.clickOnLogin();

    }

    @Then("Home page should be displayed.")
    public void home_page_should_be_displayed() {

        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals(actualURL,expectedURL);
    }



}
