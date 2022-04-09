package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBased{
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button-2.continue-shopping-button")
    WebElement continueshoppingBtn;

    @FindBy(id="checkout")
    WebElement CheckOut;

    @FindBy(id ="ui-id-2" )
    public WebElement Dialog;

    public void continueShopping(){
        ClickButton(CheckOut);
    }
}
