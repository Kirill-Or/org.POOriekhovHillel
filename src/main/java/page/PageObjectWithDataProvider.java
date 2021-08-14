package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageObjectWithDataProvider extends BasePage {

    public PageObjectWithDataProvider(WebDriver driver) {
        super(driver);
    }

    public void sendName (String massage){
        getWebElement(nameLocator ).sendKeys(massage);
    }
    public void sendEmail (String massage){
        getWebElement(emailLocator ).sendKeys(massage);
    }
    public void sendFirstAddress (String massage){
        getWebElement(addressLocator ).sendKeys(massage);
    }
    public void sendSecondAddress (String massage){
        getWebElement(permanentLocator ).sendKeys(massage);
    }
    public void clickOnSubmit (){
        clickToLocator(submitLocator);
    }

private final By nameLocator = By.xpath("//input[@id='userName']");
    private final By emailLocator = By.xpath("//input[@id='userEmail']");
    private final By addressLocator = By.xpath("//textarea[@id='currentAddress']");
    private final By permanentLocator = By.xpath("//textarea[@id='permanentAddress']");
    private final By submitLocator = By.xpath("//textarea[@id='permanentAddress']");


    }







