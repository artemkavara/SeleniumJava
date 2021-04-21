package test.ui.web;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    protected WebDriver driver;

    @FindBy(xpath = "//button[@aria-label = contains(text(), cookies)]")
    private WebElement cookies_button;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setURL(String URL){
        this.driver.get(URL);
    }

    public void selectCookies(){
        try{
            cookies_button.click();
        }
        catch(NoSuchElementException e){
        }
    }

    public boolean isCookieSelected(){
        try{
            cookies_button.isDisplayed();
        }
        catch (NoSuchElementException e){
            return false;
        }
        return true;
    }

    public void clickOnButton(WebElement element){
        element.click();
    }
}
