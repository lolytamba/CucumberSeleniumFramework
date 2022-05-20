package StepDefinitions;

import Driver.SeleniumWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenWebsite {
    private SeleniumWebDriver selenium;
    private WebDriver driver;
    @Given("the user open browser")
    public void theUserOpenBrowser() {
        selenium = new SeleniumWebDriver();
        driver = selenium.getDriver();
    }

    @And("the user open {string}")
    public void theUserOpen(String arg0) {
        driver.get("https://stockbit.com");
    }

    @Then("landing page must be shown")
    public void landingPageMustBeShown() {
        try{
            driver.findElement(By.className("start-investing")).isDisplayed();
            driver.close();
            driver.quit();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
