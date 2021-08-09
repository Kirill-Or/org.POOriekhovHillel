package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactoryComment {


    private WebDriver driver;

    @FindBy(xpath = "//a[@title='The New Marc Jacobs Gotham Saddle Bag']")
    WebElement locatorReadMore;

    @FindBy(xpath = "//input[@id='author']")
    WebElement nameLocator;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailLocator;

    @FindBy(xpath = "//textarea[@id='comment']")
    WebElement commentLocator;

    @FindBy(xpath =  "//input[@id='submit']")
    WebElement submitCommentLocator;

    @FindBy(xpath = "//div[@class='wp-die-message']")
    WebElement errorLocatorMessage;

    public PageFactoryComment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnReadMore(){
            locatorReadMore.click();
    }
    public void writeName(String name){
    nameLocator.sendKeys(name);
    }
    public void writeEmail(String email){
        emailLocator.sendKeys(email);
    }
    public void writeComment(String yourComment){
        commentLocator.sendKeys(yourComment);
    }
    public void sendComment (){
        submitCommentLocator.click();
    }
    public boolean isErrorMessageDisplayed ( ){
        WebDriverWait webDriverWait = new WebDriverWait (driver, 3);
        webDriverWait.until(ExpectedConditions.visibilityOf(errorLocatorMessage));
       return errorLocatorMessage.isDisplayed();

    }
}
