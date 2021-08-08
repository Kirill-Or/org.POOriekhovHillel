import page.FirstPO;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishListWithPage extends BaseTest {


 @Test
    public void autoAddYoWish(){
     getDriver().get("https://shop.demoqa.com/");
     FirstPO firstPO =  new FirstPO(getDriver());
     firstPO.moveToElement();
     firstPO.addToWishListClick();
     firstPO.moveToElement();
     Assert.assertTrue(firstPO.isAddDisplayed());
 }
}
