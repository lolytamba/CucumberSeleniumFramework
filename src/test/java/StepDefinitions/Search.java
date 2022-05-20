package StepDefinitions;

import Driver.SeleniumWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    private SeleniumWebDriver selenium;
    private WebDriver driver;
    @Given("the user is on the snips page")
    public void theUserIsOnTheSnipsPage() {
        selenium = new SeleniumWebDriver();
        driver = selenium.getDriver();
        driver.get("https://snips.stockbit.com/");
    }

    @And("the user search for any keywords")
    public void theUserSearchForAnyKeywords() {
        driver.findElement(By.className("search-input")).sendKeys("inflasi");
    }

    @Then("the page showing article for related keywords")
    public void thePageShowingArticleForRelatedKeywords() {
        driver.getPageSource().equals("inflasi");
    }
}
