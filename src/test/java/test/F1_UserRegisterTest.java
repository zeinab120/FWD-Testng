package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class F1_UserRegisterTest extends TestBasedShared {
    HomePage homeObject;
    RegistrationPage registrationObject;
    LoginPage loginObject;
    SearchPage searchObject;
    PasswordRecoveryPage PRobject;
    SearchArrayPage Search_Array_Object;
    Assertion softAssert = new SoftAssert();
    Random rand = new Random();
    int number = rand.nextInt(100);
    public String userName = "Zeinab" + number;
    public String userEmail = userName + "@gmail.com";


    @Test(priority = 1)
    public void UserRegisterSuccessfully() {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registrationObject = new RegistrationPage(driver);
        registrationObject.UserRegisteration("Zeinab", "Mohamed", userEmail, "123456");
        softAssert.assertEquals(true, registrationObject.ContinueBtn.isDisplayed());
        //Assert.assertEquals(registrationObject.result.getText(), "Your registration completed");

    }


    @Test(priority = 2)
    public void Userlogout() {
        registrationObject.RegisteredUserCanLogout();
    }


    @Test(priority = 3)
    public void UserLoginSuccessfully() {

        //Nullpoint because didn't take object
        homeObject = new HomePage(driver);
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.UserLoginPage(userEmail, "123456");
    }

    @Test(priority = 4)
    public void UserResetHisPassword() {
        registrationObject.RegisteredUserCanLogout();
        homeObject.OpenLoginPage();
        //  PRobject.OpenLoginPage();
        loginObject.redirectToResetPassword();
        PRobject = new PasswordRecoveryPage(driver);
        PRobject.ResetPassword(userEmail);
        Assert.assertTrue(PRobject.SuccessMessage.getText().contains("Email with instructions "));
        homeObject.CloseResetSuccessMessage();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @Test(priority = 5)
    public void UserLoginSuccessfully1() throws InterruptedException {

        //Nullpoint because didn't take object
        homeObject = new HomePage(driver);
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.UserLoginPage(userEmail, "123456");
    }

}




