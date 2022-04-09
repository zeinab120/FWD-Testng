package test;
import Pages.ComparePage;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToComareTest extends TestBasedShared {

    String firstProductName = "HTC One M8 Android L 5.0 Lollipop";
    String secondProductName = "Apple MacBook Pro 13-inch";


        // 1- Search for product number 1
        // 2- Search for product number 2
        // 3- Add to compare

        ComparePage compareObject ;
        SearchPage searchObject ;
        ProductDetailsPage DetailsObject;

        @Test(priority = 1)
        public void UserCanCompareProducts() throws InterruptedException {
            searchObject = new SearchPage(driver);
            DetailsObject = new ProductDetailsPage(driver);
            compareObject = new ComparePage(driver);
            searchObject.SearchPage("MacB");
            Assert.assertTrue(DetailsObject.productNamebreadCrumb.getText().contains(secondProductName));
            DetailsObject.AddProductToCompare();

            searchObject.SearchPage("Android");
            Assert.assertTrue(DetailsObject.productNamebreadCrumb.getText().contains(firstProductName));
            DetailsObject.AddProductToCompare();
            Thread.sleep(1000);

            driver.navigate().to("http://demo.nopcommerce.com" + "/compareproducts");
            Assert.assertTrue(compareObject.firstProductName.getText().equals("HTC One M8 Android L 5.0 Lollipop"));
            Assert.assertTrue(compareObject.secodProductName.getText().equals("Apple MacBook Pro 13-inch"));
            compareObject.CompareProducts();
        }

}
