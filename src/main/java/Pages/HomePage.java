package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class HomePage extends PageBased {
    public HomePage(WebDriver driver) {

        super(driver);
        actions = new Actions(driver);

    }
    /*  @FindBy(css = "a.ico-register")
      WebElement RegisterLink;*/
    @FindBy(linkText = "Register")
    WebElement RegisterLink;

   @FindBy(css = "a.ico-login")
    WebElement loginLink;

    @FindBy(linkText = "Forgot password?")
    WebElement ForgotPaswordLink;

    @FindBy(id = "customerCurrency")
    WebElement changeCurrencyList;

    //@FindBy(id = "price-value-4")
    @FindBy(css = "span.price.actual-price")
    public WebElement productPrice;

    @FindBy(linkText = "computer")
    public WebElement ProductTag;

    @FindBy(tagName = "h1")
    public WebElement pageTitleTag;

    @FindBy(linkText="Apparel")
    WebElement ComputerMenu;

    @FindBy(linkText="Shoes")
    WebElement NotbooksMenu;

    @FindBy(css ="label.attribute-squares.color-squares")
    WebElement greyColor;

    @FindBy(css ="span.close")
    WebElement ResetSuccessMessage;

   /*  @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement ComputerMenu;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
    WebElement NotbooksMenu;*/




    public void openRegistrationPage() {
        ClickButton(RegisterLink);
    }
    public SearchArrayPage searchArrayPage1(){

        return new SearchArrayPage(driver);
    }


   public void OpenLoginPage() {
       ClickButton(loginLink);


   }

    public void OpenPasswordRecoveryPage() {
        ClickButton(ForgotPaswordLink);
    }

    public void ChangCurency() {
        Select select = new Select(changeCurrencyList);
        select.selectByVisibleText("Euro");
    }

    public void SelectTagAndAssert() {

        ClickButton(ProductTag);

    }

    public void selectCategoryMenu()

        {
          // actions.moveToElement(ComputerMenu).moveToElement(NotbooksMenu).click().build().perform();
           ClickButton(ComputerMenu);
           ClickButton(NotbooksMenu);
        }
    public void FilterColor(){
        ClickButton(greyColor);

    }
    public void CloseResetSuccessMessage(){
        ClickButton(ResetSuccessMessage);
    }

    }


