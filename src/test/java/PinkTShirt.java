import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SecondPO;

public class PinkTShirt extends BaseTest {

    @Test
    public void addToCartPinkTShirt(){
        getDriver().get("https://shop.demoqa.com/");
        SecondPO secondPO = new SecondPO(getDriver());
        secondPO.moveToTShirt();
        secondPO.clickTShirt();
        secondPO.chooseColor();
        secondPO.chooseSize();
        secondPO.chooseQuantity();
        secondPO.addToCart();
        secondPO.goToCart();
        Assert.assertTrue(secondPO.isTShirtAdded());
    }
}
