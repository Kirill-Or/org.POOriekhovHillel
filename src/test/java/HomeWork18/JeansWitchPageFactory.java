package HomeWork18;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.PageFactoryBlueQuery;

public class JeansWitchPageFactory extends BaseTest {

    @Test
    public void addToCartJeansTest () throws InterruptedException {

        allureLog("is jeans added to cart");
        getDriver().get("http://shop.demoqa.com/");
        PageFactoryBlueQuery pageFactoryBlueQuery = new PageFactoryBlueQuery(getDriver());
        pageFactoryBlueQuery.clickToSearch();
        pageFactoryBlueQuery.inputToSearchBlue();
        pageFactoryBlueQuery.filterSize("37");
        pageFactoryBlueQuery.chooseFirstItem();
        pageFactoryBlueQuery.chooseColor("Blue");
        pageFactoryBlueQuery.chooseSize("37");
        pageFactoryBlueQuery.addToCart();
        pageFactoryBlueQuery.clickToCart();
        Assert.assertTrue(pageFactoryBlueQuery.isJeansAdded());
    }


}
