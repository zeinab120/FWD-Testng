package test;

import Pages.SearchPage;
import Pages.WishListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDetailsPage;
import test.TestBasedShared;

public class WishListTest extends TestBasedShared {

        SearchPage SearchObject;
        ProductDetailsPage productDetails;
        WishListPage wishlistObject;
        String productName = "Apple MacBook Pro 13-inch";

        @Test(priority=1)
        public void UserCanSearchForProductsWithAutoSuggest() throws InterruptedException {
            SearchObject = new SearchPage(driver);
            SearchObject.SearchPage("MacB");
            productDetails = new ProductDetailsPage(driver);
            Assert.assertTrue(productDetails.productNamebreadCrumb.getText().contains(productName));
        }

        @Test(priority=2)
        public void UserCanAddProductToWishlist() throws InterruptedException {
            productDetails = new ProductDetailsPage(driver);
            productDetails.AddToWishlist();
            driver.navigate().to("http://demo.nopcommerce.com" + "/wishlist");
            wishlistObject = new WishListPage(driver);
            Assert.assertTrue(wishlistObject.wishlistHeader.isDisplayed());
            Assert.assertTrue(wishlistObject.productCell.getText().contains(productName));
        }
}
