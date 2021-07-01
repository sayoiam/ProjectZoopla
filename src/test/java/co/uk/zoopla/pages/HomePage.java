package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement acceptCookieButton;
    @FindBy(id = "header-location")
    private WebElement location;
    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement bedDrop;
    @FindBy(css = ".css-w266us-StyledSuggestionButton.eubx8ma5")
    private List<WebElement> autoComplete;
    @FindBy(id = "beds_min")
    private WebElement minimumBed;
    @FindBy(id = "beds_max")
    private WebElement maximumBed;
    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement priceDrop;
    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(id = "price_max")
    private WebElement maxPrice;
    @FindBy(css = "[data-testid=\"PropertyType_testId\"] .css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement propertyDrop;
    @FindBy(css = "[for=\"desktop_subheader_property_type_option_houses\"]")
    private WebElement houseRadioButton;
    @FindBy(css = "[for=\"desktop_subheader_property_type_option_flats\"]")
    private WebElement flatsRadioButton;
    @FindBy(css = "[for=\"desktop_subheader_property_type_option_farms_land\"]")
    private WebElement farmRadioButton;
    @FindBy(css = "[data-testid=\"search-button\"]")
    private WebElement searchButton;



    public void acceptCookiePolicy()
    {
        acceptCookieButton.click();
    }

    public void enterLocation(String loc)
    {
        location.sendKeys(loc);
    }

    public void dropBedSelector()
    {
        bedDrop.click();
    }

    public void clickFirstOption()
    {
        autoComplete.get(0).click();
    }

    public void selectMinBed(String minBed)
    {
        selectByText(minimumBed, minBed);
    }

    public void selectMaxBed(String maxBed)
    {
        selectByText(maximumBed, maxBed);
    }

    public void dropPriceSelector()
    {
        priceDrop.click();
    }

    public void selectMinPrice(String miPrice)
    {
        selectByText(minPrice, miPrice);
    }

    public void selectMaxPrice(String maPrice)
    {
        selectByText(maxPrice, maPrice);
    }
    public void dropPropertySelector()
    {
        propertyDrop.click();
    }

    private void clickOnHouses()
    {
        houseRadioButton.click();
    }

    private void clickOnFlats()
    {
        flatsRadioButton.click();
    }

    private void clickOnFarm()
    {
        farmRadioButton.click();
    }

    public void clickOnProperty(String prop)
    {
        if(prop.equals("Houses"))
        {
            clickOnHouses();
        } else if(prop.equals("Flats"))
        {
            clickOnFlats();
        } else if (prop.equals("Farms/land"))
        {
            clickOnFarm();
        }
    }

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }


}
