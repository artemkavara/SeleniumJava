package test.ui.web;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutPage extends MainPage{

    private WebElement countryButton;

    public AboutPage(WebDriver driver){
        super(driver);
    }

    public void setCountryButton(String nameButton) {
        String xpath = String.format("//div[@class = \"owl-item active\"]//button[div[text() = \"%s\"]]", nameButton);
        Actions actions = new Actions(super.driver);
        countryButton = super.driver.findElement(By.xpath(xpath));
        actions.moveToElement(countryButton).perform();
    }

    public boolean ifCountryVisible(String nameCountry){
        String path = String.format("//h2[text() = \"%s\"]", nameCountry);
        try {
            WebElement header = super.driver.findElement(By.xpath(path));
        } catch (NoSuchElementException e){
            return false;
        }
        return true;
    }
}
