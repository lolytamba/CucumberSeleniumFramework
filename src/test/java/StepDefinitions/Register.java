package StepDefinitions;

import Driver.SeleniumWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
    private SeleniumWebDriver selenium;
    private WebDriver driver;
    @Given("the user is on the register page")
    public void theUserIsOnTheRegisterPage() {
        selenium = new SeleniumWebDriver();
        driver = selenium.getDriver();
        driver.get("https://stockbit.com/#/register");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("register-email")));
        driver.findElement((By.className("register-email"))).click();
    }

    @And("the user must be fill all the fields")
    public void theUserMustBeFillAllTheFields() {
        driver.findElement(By.id("input-1")).sendKeys("Loly Elia Tamba");
        driver.findElement(By.id("input-2")).sendKeys("tlolyelia@gmail.com");
        driver.findElement(By.id("input-3")).sendKeys("lolyeliat");
        driver.findElement(By.id("input-4")).sendKeys("123456");
        driver.findElement(By.id("input-5")).sendKeys("123456");
        driver.findElement(By.className("loginlogin")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("loginlogin")));
        driver.findElement(By.className("form-control")).sendKeys("85274689202");

        wait.until(ExpectedConditions.elementToBeClickable(By.className("loginlogin")));
        driver.findElement(By.className("loginlogin")).click();
    }

    @Then("the web successfully create account")
    public void theWebSuccessfullyCreateAccount() {
        driver.findElement(By.className("loginlogin verify")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
