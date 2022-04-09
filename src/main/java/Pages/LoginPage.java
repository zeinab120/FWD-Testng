package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class LoginPage extends PageBased{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="Email")
    WebElement EmailTxtField;

    @FindBy(id="Password")
    WebElement PasswordTxtField;

    @FindBy(css = "button.button-1.login-button")
    WebElement loginBtn;

    @FindBy(linkText = "Forgot password?")
   public WebElement ForgotPassword;

    @FindBy(css = "a.ico-login")
    public WebElement Reset_Login;


    public void redirectToResetPassword(){

            ClickButton(ForgotPassword);
    }

    public void openLoginPage1() {
        ClickButton(Reset_Login);
    }


    public void UserLoginPage(String Email, String Password){
        SendTxtFields(EmailTxtField,Email);
        SendTxtFields(PasswordTxtField,Password);
        ClickButton(loginBtn);

    }



}
