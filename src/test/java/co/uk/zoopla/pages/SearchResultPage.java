package co.uk.zoopla.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-testid='listing-details-link']")
    private List<WebElement> results;

    public void isSearchResultPageDisplayed()
    {
        //To verify in Selenium, we use Assert
        Assert.assertTrue(results.size() > 0);
    }

    public ProductDetailsPage clickOnAnyOfTheResults()
    {
        results.get(4).click();

        return new ProductDetailsPage(driver);
    }
}
