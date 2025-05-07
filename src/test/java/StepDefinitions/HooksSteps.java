package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

    @Before
    public void browserSetup(){
        System.out.println("Browser Setup");
    }
    @After
    public void tearDown(){
        System.out.println("Browser tearDown");
    }

    @Given("user enter login")
    public void user_enter_login(){
        System.out.println("Hook1");
    }

    @When("user valid password")
    public void userValidPassword() {
        System.out.println("Hook2");
    }

    @And("Click Login button")
    public void clickLoginButton() {
        System.out.println("Hook3");
    }

    @Then("user on home page")
    public void userOnHomePage() {
        System.out.println("Hook4");
    }
}
