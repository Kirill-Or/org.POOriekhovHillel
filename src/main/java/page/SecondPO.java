package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecondPO extends BasePage{


    private final By chooseTShirt = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt']");
    private final By color = By.xpath("//select[@id='pa_color']");
    private final By size = By.xpath("//select[@id='pa_size']");
    private final By quantity = By.xpath("//button[@class='qty-increase']");
    //private final By quantity = By.xpath("//input[@id='noo-quantity-4821']");
    private final By locatorOfAddCart = By.xpath("//button[normalize-space()='Add to cart']");
    private final By locatorOfCart = By.xpath("//i[@class='icon_bag_alt']");
    private final By checkLocator = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt - Pink']");

    public SecondPO(WebDriver driver) {
        super(driver);

    }

    public void moveToTShirt() {
        moveToLocator(chooseTShirt);
    }

    public void clickTShirt() {
        log("click on TShirt");
        clickToLocator(chooseTShirt);
    }

    public void chooseColor() {
        log("choose color");
        selectByText(color,"Pink");
    }

    public void chooseSize() {
        log("choose size");
        selectByText(size, "37");
    }

    /*  public void chooseQuantity( String writeQuantity){
          driver.findElement(quantity).click();
          driver.findElement(quantity).clear();
          driver.findElement(quantity).sendKeys(writeQuantity);
      } */
// Пробывал разные варианты но не вышло
    public void chooseQuantity() {
        log("choose quantity");
        for (int i = 0; i < 2; i++)
            clickToLocator(quantity);
    }
    public void addToCart() {
        clickToLocator(locatorOfAddCart);
    }
    public void goToCart() {
       clickToLocator(locatorOfCart);
    }
    public boolean isTShirtAdded (){
        return isDisplayed(checkLocator);


    }
}






