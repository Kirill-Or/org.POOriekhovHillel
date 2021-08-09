import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.PageFactoryComment;

public class SendCommentWithPageFactory extends BaseTest {
    @Test
    public void wrongCaptcha () {
        getDriver().get("http://shop.demoqa.com/author/lsharm/");
        PageFactoryComment pageFactoryComment = new PageFactoryComment(getDriver());
        pageFactoryComment.clickOnReadMore();
        pageFactoryComment.writeName("John");
        pageFactoryComment.writeEmail("JohnSmith@example.com");
        pageFactoryComment.writeComment("Awesome Bag");
        pageFactoryComment.sendComment();
        Assert.assertTrue(pageFactoryComment.isErrorMessageDisplayed());





    }







}
