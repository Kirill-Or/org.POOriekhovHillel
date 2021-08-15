package HomeWork21;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.BankPageObject;

public class TestWithCollaborator extends BaseTest {
@Test
    public void sendBugReportTest() {
        BankPageObject bankPageObject = new BankPageObject(getDriver());
        getDriver().get("https://idemo.bspb.ru/");
        bankPageObject.submitFirstField();
        bankPageObject.submitTwoFactorAuth();
        bankPageObject.openMessages();
        bankPageObject.markRead();
        bankPageObject.newMessage();
        bankPageObject.selectTypeMessage(9);
        bankPageObject.TypeBugReport("Можно зайти на сайт под дефолтными данными");
        bankPageObject.sendEmail();
        Assert.assertTrue(bankPageObject.isMessageSent());

    }
}