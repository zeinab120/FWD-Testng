package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends TestBasedShared {
    SearchPage searchObject;
    ProductDetailsPage DetailsObject;
    HomePage homeObject;
    AddToCartPage ATCObject;

    String productName = "Apple MacBook Pro 13-inch";
    String productName2 = "Samsung Series 9 NP900X4C Premium Ultrabook";


    @Test(priority = 1)
    public void UserCanSearch() throws InterruptedException {
        searchObject= new SearchPage(driver);
        searchObject.SearchPage(productName);
        DetailsObject = new ProductDetailsPage(driver);
            Assert.assertTrue(DetailsObject.productNamebreadCrumb.getText().contains(productName));
        }

        @Test(priority = 2)
    public void UserCanAddToCart() throws InterruptedException {
            DetailsObject = new ProductDetailsPage(driver);
            DetailsObject.AddToCart();
            Assert.assertTrue(DetailsObject.NotificationBar.getText().contains("product has been added"));
            homeObject=new HomePage(driver);
            searchObject.SearchPage(productName2);
            DetailsObject.AddToCart2();
            Thread.sleep(1000);
            driver.navigate().to("http://demo.nopcommerce.com" + "/cart");
            Assert.assertTrue(DetailsObject.ShoppingCart.getText().contains("Shopping"));


        }

        @Test(priority = 3)
    public void CheckOut(){
ATCObject=new AddToCartPage(driver);
            ATCObject.continueShopping();
            Assert.assertTrue(ATCObject.Dialog.getText().contains("Terms"));
        }

    }
