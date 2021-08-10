package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactoryBlueQuery {

    private WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Search']")
    WebElement searchLocator;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inputBlue;

    @FindBy(xpath = "//div[@class='pull-right noo_woocommerce-catalog']//select[@name='filter_size']")
    WebElement filterSizeLocator;

    @FindBy(xpath = "//div[@class='owl-item'][1]")
    WebElement chooseFirstItemLocator;

    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement chooseColorLocator;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement chooseSizeLocator;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartLocator;

    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement goToCartLocator;

    @FindBy(xpath = "//a[contains(text(),'blue sinner ripped knee high waist skinny jeans - ')]")
    WebElement isDisplayedLocator;

    public PageFactoryBlueQuery(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickToSearch() {
        searchLocator.click();
    }
    public void inputToSearchBlue(){
        inputBlue.sendKeys("Blue");
        inputBlue.submit();
    }
    public void filterSize (String size) throws InterruptedException {
        Select select = new Select(filterSizeLocator);
        select.selectByVisibleText(size);
    }
    public void chooseFirstItem() throws InterruptedException {
        chooseFirstItemLocator.click();
        Thread.sleep(1500);
    }
    public void chooseColor (String color){
        Select select = new Select(chooseColorLocator);
        select.selectByVisibleText(color);
    }
    public void chooseSize (String size) {
        Select select = new Select(chooseSizeLocator);
        select.selectByVisibleText(size);
    }
    public void addToCart (){
        addToCartLocator.click();
    }
    public void clickToCart (){
        goToCartLocator.click();
    }
    public boolean isJeansAdded () {
        WebDriverWait webDriverWait = new WebDriverWait (driver, 3);
        webDriverWait.until(ExpectedConditions.visibilityOf(isDisplayedLocator));
        return isDisplayedLocator.isDisplayed();
    }
}