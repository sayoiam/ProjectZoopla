package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.ProductDetailsPage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BasePage {

    HomePage homePage = new HomePage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

    @Given("I navigate to Zoopla homepage")
    public void iNavigateToZooplaHomepage() {
        navigateToHomepage();
        homePage.acceptCookiePolicy();
    }

    @When("I enter location as {string}")
    public void iEnterLocationAs(String location) {

        homePage.enterLocation(location);
       // homePage.clickFirstOption();
    }

    @And("I select mininum bed as {string}")
    public void iSelectMininumBedAs(String mini) {
        homePage.dropBedSelector();
        homePage.selectMinBed(mini);
    }

    @And("I select maximum bed as {string}")
    public void iSelectMaximumBedAs(String maxi) {
        homePage.selectMaxBed(maxi);
    }

    @And("I select minimum price as {string}")
    public void iSelectMinimumPriceAs(String minPrice) {
        homePage.dropPriceSelector();
        homePage.selectMinPrice(minPrice);
    }

    @And("I select maximum price as {string}")
    public void iSelectMaximumPriceAs(String maxPrice) {
        homePage.selectMaxPrice(maxPrice);
    }

    @And("I choose {string} as the property type")
    public void iChooseAsThePropertyType(String property) {
        homePage.dropPropertySelector();
        homePage.clickOnProperty(property);
    }

    @And("I click on Search button")
    public void iClickOnSearchButton() {
        searchResultPage = homePage.clickOnSearchButton();
    }

    @Then("search result page is displayed")
    public void searchResultPageIsDisplayed() {
        searchResultPage.isSearchResultPageDisplayed();
    }

    @And("I can click on any of the results")
    public void iCanClickOnAnyOfTheResults() {
        productDetailsPage = searchResultPage.clickOnAnyOfTheResults();

    }
}
