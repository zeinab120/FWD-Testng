package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBased {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="gender-female")
    WebElement GenderRadioButton;

    @FindBy(id ="FirstName")
    WebElement FirstNameTxtField;

    @FindBy(id ="LastName")
    WebElement LastNameTxtField;

    @FindBy(id="Email")
    WebElement EmailTxtField;

    @FindBy(id="Password")
    WebElement PasswordTxtField;

    @FindBy(id="ConfirmPassword")
    WebElement ConfirmPassword;

    @FindBy(id="register-button")
    WebElement registerBtn;

    @FindBy(css = "a.button-1.register-continue-button")
    public WebElement ContinueBtn;

 /*   @FindBy(css = "div.result")
    public WebElement result;*/

    @FindBy(css = "a.ico-logout")
    WebElement logoutLink;


    public void UserRegisteration(String FirstName, String LastName, String Email, String Password){
        SendTxtFields(FirstNameTxtField,FirstName);
        SendTxtFields(LastNameTxtField,LastName);
        SendTxtFields(EmailTxtField,Email);
        SendTxtFields(PasswordTxtField,Password);
        SendTxtFields(ConfirmPassword,Password);
        ClickButton(registerBtn);
    }
    public void RegisteredUserCanLogout(){
        ClickButton(logoutLink);

    }
}
