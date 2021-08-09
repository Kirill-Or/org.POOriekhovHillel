package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getWebElement (By locator){
        return driver.findElement(locator);
    }

    public void moveToLocator (By locator){
        WebElement element = getWebElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void clickToLocator (By locator){
        getWebElement(locator).click();
    }
    public void selectByText (By locator, String visibleText){
            Select select = new Select(getWebElement(locator));
            select.selectByVisibleText(visibleText);
    }
    public boolean isDisplayed (By locator){
        WebDriverWait webDriverWait = new WebDriverWait (driver, 3);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return getWebElement(locator).isDisplayed();
    }


}
