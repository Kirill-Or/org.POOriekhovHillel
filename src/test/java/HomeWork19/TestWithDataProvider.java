package HomeWork19;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.PageObjectWithDataProvider;


public class TestWithDataProvider extends BaseTest {
//    private final By nameLocator = By.xpath("//input[@id='userName']");
//    private final By emailLocator = By.xpath("//input[@id='userEmail']");
//    private final By addressLocator = By.xpath("//textarea[@id='currentAddress']");
//    private final By permanentLocator = By.xpath("//textarea[@id='permanentAddress']");
//    private final By submitLocator = By.xpath("//textarea[@id='permanentAddress']");

@Test( dataProvider= "data-provider")
    public void firstTestDataProvider(String name, String email, String address, String permanentLocator) throws InterruptedException {
    PageObjectWithDataProvider pageObjectWithDataProvider = new PageObjectWithDataProvider(getDriver());
    getDriver().get("https://demoqa.com/text-box");
    pageObjectWithDataProvider.sendName(name);
    pageObjectWithDataProvider.sendEmail(email);
    pageObjectWithDataProvider.sendFirstAddress(address);
    pageObjectWithDataProvider.sendSecondAddress(permanentLocator);
    pageObjectWithDataProvider.clickOnSubmit();
    Thread.sleep(1500);
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
