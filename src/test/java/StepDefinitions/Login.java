package StepDefinitions;

import Driver.SeleniumWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private SeleniumWebDriver selenium;
    private WebDriver driver;
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        selenium = new SeleniumWebDriver();
        driver = selenium.getDriver();
        driver.get("https://stockbit.com/#/login");
    }

    @And("the user log in")
    public void theUserLogIn() {
        driver.findElement(By.name("username")).sendKeys("lolyeliatamba");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("the user navigate to the stream page")
    public void theUserNavigateToTheStreamPage() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("skip-btn")));
        driver.findElement(By.className("skip-btn")).click();
        driver.close();
        driver.quit();
    }
}
