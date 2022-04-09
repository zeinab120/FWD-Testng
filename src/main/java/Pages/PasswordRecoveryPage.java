package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class PasswordRecoveryPage extends PageBased{
    public PasswordRecoveryPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a.ico-login")
    WebElement loginLink;

    @FindBy(css = "input.email")
    WebElement EmailAddress;

    @FindBy(css = "button.button-1.password-recovery-button")
    WebElement RecoveryBtn;

    @FindBy(linkText = "Forgot password?")
    public  WebElement ForgotPassword;

    @FindBy(css = "div.bar-notification.success")
    public WebElement SuccessMessage;

    @FindBy(css = "a.ico-register")
    public WebElement Reset_register;





    public void OpenLoginPage() {
        ClickButton(loginLink);
    }
    public void openRegistrationPage1() {
        ClickButton(Reset_register);
    }





    public void ResetPassword(String Email){
        SendTxtFields(EmailAddress,Email);
        ClickButton(RecoveryBtn);



    }
}
