package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

    WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@placeholder=\"Enter Name\"]")
    WebElement searchBox;


    public void enterInSearchBox(String username, String password) throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://testautomationpractice.blogspot.com/");
//        Thread.sleep(7000);
//        searchBox.sendKeys(username);
//        driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).clear();
//        Thread.sleep(3000);
        System.out.println(username + " _username");
        System.out.println(password + " _password");
//        driver.quit();
    }

}
