package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FirstPO  extends BasePage {


 //div[@class='noo-thumbnail-product hover-device'] такой локатор, чтобы найти 1 из 3 почему-то не работает, не знаю где ошибка
    private final By fieldForHover = By.xpath("//a[normalize-space()='Tokyo Talkies']");
    private final By addToWishList = By.cssSelector(".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=704']");
    private final By addDisplayed = By.xpath("//a[normalize-space()='Browse Wishlist']");

    public FirstPO(WebDriver driver) {
        super(driver);
    }
    public void moveToElement(){
        log("move to element ");
        moveToLocator(fieldForHover);
    }
    public void addToWishListClick (){
        log("add to wish List");
        clickToLocator(addToWishList);
    }
    public boolean isAddDisplayed (){
log("is add displayed");
       return isDisplayed(addDisplayed);
    }
}