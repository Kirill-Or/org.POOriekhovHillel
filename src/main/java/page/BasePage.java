package page;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public abstract class BasePage {

    private WebDriver driver;
    @Step("Allure log: {0}")
    public void log (String message){
        System.out.println(message);
        saveScreenshotPNG();
    }
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


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
    public void sendKeysToLocator (By locator , String input) {
        getWebElement(locator).sendKeys(input);
    }
    }

