package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

/*public class PageObjectWithDataProvider extends BasePage {

    public PageObjectWithDataProvider(WebDriver driver) {
        super(driver);
    }

    @DataProvider(name = "data-provider")
    public Object [][] dpMethod() {
        return new Object[][]{
                {"John Smith", "johnsmith@example.com", "New York", "New York"},
                {"Bob Dylan", "bobdylan@example.com", "San Francisco", "San Francisco"},
                {"Petro Vasilevich", "petrovasilevich@example.com", "Mykolaiv", "Mykolaiv"},
                {"Dan Balan", "DanBalan@example.com", "Norilsk", "Norilsk"},
                {"Palvo Slavovich", "pavloslavovich@example.com", "Brno", "Brno"},
        };
    }
}
/*



private final By nameLocator = By.xpath("//input[@id='userName']");
    private final By emailLocator = By.xpath("//input[@id='userEmail']");
    private final By addressLocator = By.xpath("//textarea[@id='currentAddress']");
    private final By permanentLocator = By.xpath("//textarea[@id='permanentAddress']");
    private final By submitLocator = By.xpath("//textarea[@id='permanentAddress']");


    @DataProvider(name = "data-provider")
    public Object [][] dpMethod() {
        return new Object[][]{
                {"John Smith", "johnsmith@example.com", "New York", "New York"},
                {"Bob Dylan", "bobdylan@example.com", "San Francisco", "San Francisco"},
                {"Petro Vasilevich", "petrovasilevich@example.com", "Mykolaiv", "Mykolaiv"},
                {"Dan Balan", "DanBalan@example.com", "Norilsk", "Norilsk"},
                {"Palvo Slavovich", "pavloslavovich@example.com", "Brno", "Brno"},
        };
    }

    public void sendKeysToName (){
        sendKeysToLocator(nameLocator, ());
    }
 }
*/







