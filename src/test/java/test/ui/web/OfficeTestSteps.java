package test.ui.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OfficeTestSteps {
    private AboutPage aboutPage;

    public OfficeTestSteps(BaseTest baseTest){
        aboutPage = new AboutPage(baseTest.driver);
    }

    @Given("^I am on EPAM Our Office page$")
    public void getToAboutPage(){
        aboutPage.driver.get("https://www.epam.com/about");
        aboutPage.selectCookies();
    }

    @When("^I press on \"([^\"]*)\"$")
    public void clickOnCountry(String country){
        aboutPage.setCountryButton(country);
    }

    @Then("^the list of offices in \"([^\"]*)\" should be opened$")
    public void openCountry(String country){
        Assert.assertTrue(aboutPage.ifCountryVisible(country));
    }

}
