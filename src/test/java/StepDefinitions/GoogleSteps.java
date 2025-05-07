package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {

    WebDriver driver = null;

    @Given("Browser open")
    public void browserOpen(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("User enter text in search box")
    public void userEnterTextInSearchBox() {
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @And("Click Enter")
    public void clickEnter() {
        System.out.println("Hello3");
    }

    @Then("User should home page")
    public void userShouldHomePage() {
        System.out.println("Hello4");
        driver.quit();
    }
}
