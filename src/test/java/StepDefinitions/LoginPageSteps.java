package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;

public class LoginPageSteps {
    WebDriver driver = null;
    LogInPage page;

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
    public void passedusernameandpassword(String username, String Password) throws InterruptedException {
        page = new LogInPage(driver);
        System.out.println("Scenario Outline");
        page.enterInSearchBox(username, Password);
    }

}
