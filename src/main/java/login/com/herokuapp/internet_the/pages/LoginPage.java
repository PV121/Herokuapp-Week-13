package login.com.herokuapp.internet_the.pages;


import dev.failsafe.internal.util.Assert;
import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    // enter username
   By Username=  By.name("username");

   public void enterUserName(String username){
       sendTextToElement(Username,username);
   }
    By Password= By.name("password");
   public void enterPassword(String password){
       sendTextToElement(Password,password);
   }
   By LoginBtn= By.xpath("//i[contains(text(),'Login')]");
   public void clickOnButton(){
       clickOnElement(LoginBtn);
   }
   By Message = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
   public String errorMessage(){
       return getTextFromElement(Message);
   }
   By InvalidUserNameErrorMessage= By.xpath("//div[@id='flash']");
    public String invalidUsernameErrorMessage() {
        return getTextFromElement(InvalidUserNameErrorMessage).substring(0,25);
    }
    By InvalidPasswordErrorMessage= By.xpath("//div[@id='flash']");
    public String invalidPasswordErrorMessage(){
        return getTextFromElement(InvalidPasswordErrorMessage).substring(0,25);
    }








//        sendTextToElement(By.name("password"),"SuperSecretPassword!");
//        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
//        verifyText("Message","Secure Area", By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]"));
//    }
//    @Test
//    public void verifyTheUsernameErrorMessage(){
//        sendTextToElement(By.name("username"),"tomsmith1");
//        sendTextToElement(By.name("password"),"SuperSecretPassword!");
//        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
//
//        String expectedMessage = "Your username is invalid!";
//        String actualMessage = getTextFromElement(By.xpath("//div[@id='flash']")).substring(0,25);
//        Assert.assertEquals(expectedMessage,actualMessage);
//    }
//    @Test
//    public void verifyThePasswordErrorMessage(){
//        sendTextToElement(By.name("username"),"tomsmith");
//        sendTextToElement(By.name("password"),"SuperSecretPassword");
//        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
//
//
//        String expectedMessage = "Your password is invalid!";
//        String actualMessage = getTextFromElement(By.xpath("//div[@id='flash']")).substring(0,25);
//        Assert.assertEquals(expectedMessage,actualMessage);
//    }
//

}