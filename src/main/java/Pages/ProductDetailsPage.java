package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBased{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }


        @FindBy(tagName = "h1")
        public WebElement ShoppingCart;

        @FindBy(id="price-value-4")
        public WebElement productPrice;

        @FindBy(id="add-to-wishlist-button-4")
        WebElement AddToWishlistBtn;

        @FindBy(css = "div.bar-notification.success")
        public WebElement NotificationBar;

    @FindBy(css="strong.current-item")
    public WebElement productNamebreadCrumb;

    @FindBy(linkText = "wishlist")
        WebElement WishlistLink;
    @FindBy (css = "button.button-2.add-to-compare-list-button")
    WebElement CopmareButton;

       @FindBy(id="add-to-cart-button-4")
        WebElement AddToCartBtn;

        @FindBy(linkText = "shopping cart")
        WebElement shoppingCartLink;

    @FindBy(id = "add-to-cart-button-6")
    WebElement CartBtn;


        public void AddToWishlist()
        {
            ClickButton(AddToWishlistBtn);
        }

         public void AddProductToCompare(){
             ClickButton(CopmareButton);

        }

        public void AddToCart()
        {
            ClickButton(AddToCartBtn);
        }

        public void AddToCart2(){
            ClickButton(CartBtn);
        }

        public void OpenShoppingCartPage()
        {
            ClickButton(shoppingCartLink);;
        }
    }
