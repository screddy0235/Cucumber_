package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    @Given("User passed URL")
    public void User_passed_URL(){
        System.out.println("Hello1");
    }

    @When("passed Credentials")
    public void passedCredentials() {
        System.out.println("Hello2");
    }

    @And("click Submit Button")
    public void clickSubmitButton() {
        System.out.println("Hello3");

    }

    @Then("User should see Login Page")
    public void userShouldSeeLoginPage() {
        System.out.println("Hello4");
    }

    @When("passed {string} and {string} Credentials")
    public void passedusernameandpassword(String username, String Password){
        System.out.println("Scenario Outline");
    }
}
