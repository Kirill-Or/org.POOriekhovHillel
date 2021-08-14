package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankPageObject extends BasePage{

    private final By loginLocator = By.xpath("//input[@placeholder='Логин']");
    private final By passwordLocator = By.xpath("//input[@placeholder='Пароль']");
    private final By submitLocator = By.xpath("//button[contains(text(),'Войти')]");
    private final By twoFactorLocator = By.xpath("//input[@id='otp-code']");
    private final By enterLocator = By.xpath("//button[contains(text(),'Войти')]");
    private final By messagesLocator = By.xpath("//span[@class='icon-email']");
    private final By markThoseAsReadLocator = By.xpath("//a[contains(text(),'Отметить все как прочитанные')]");
    private final By newMassageLocator = By.xpath("//a[contains(text(),'Новое сообщение')]");
    private final By newMassageSelectLocator = By.xpath("//select[@name='message.topicName']");
    private final By addMessageLocator = By.xpath("//textarea[@name='message.text']");
    private final By sendMessageLocator = By.xpath("//button[@id='send-button']");
    private final By isMessageSentLocator = By.xpath("//div[@class='alert alert-success']");

    public BankPageObject(WebDriver driver) {
        super(driver);
    }

     public void submitFirstField (){
        clickToLocator(submitLocator);
     }

     public void submitTwoFactorAuth(){
        clickToLocator(enterLocator);
     }
     public void openMessages(){
        clickToLocator(messagesLocator);
     }
     public void markRead(){
        clickToLocator(markThoseAsReadLocator);
     }
     public void newMessage(){
        clickToLocator(newMassageLocator);
     }
     public void selectTypeMessage(int value ){
        selectByIndex(newMassageSelectLocator,value);
     }
     public void TypeBugReport( String sendReport) {
       waitSomeWhere(addMessageLocator);
        sendKeysToLocator(addMessageLocator, sendReport);
     }
     public void sendEmail(){
        clickToLocator(sendMessageLocator);
     }
     public boolean isMessageSent(){
        return isDisplayed(isMessageSentLocator);
     }






}
