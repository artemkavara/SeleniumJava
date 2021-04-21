package test.ui.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CookiesSelectTest {

    private MainPage mainPage;

    public CookiesSelectTest(BaseTest baseTest){
        this.mainPage = new MainPage(baseTest.driver);
    }

    @Given("^I am on EPAM main page$")
    public void setupMainPage(){
        mainPage.setURL("https://www.epam.com/");
    }

    @When("^I click Accept Cookie Button$")
    public void selectCookies(){
        mainPage.selectCookies();
    }

    @Then("^Cookie Button is hidden$")
    public void areCookiesSelected(){
        Assert.assertFalse(mainPage.isCookieSelected());
    }

}
