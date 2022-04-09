package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class SearchArrayPage extends PageBased {
    public SearchArrayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement ProductSearchTxtfield;

    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchButton;

   /* @FindBy(css="h2.product-title")
    WebElement Product_search;*/


    public void User_Search_productsName(String productName) {
        SendTxtFields(ProductSearchTxtfield, productName);
        ClickButton(searchButton);
    }

 /*   public void user_Could_find_relative_results() {
      ArrayList ProductList = new ArrayList<>();
      //  =Product_search.getSize();

        int count = driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
 for (int x=0; x< count ; x++){
   // System.out.println(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
     ProductList.add(driver.findElements(By.cssSelector("h2[class=\"product-title\"]a")).get(x).getText());
 }
//System.out.println(ProductList);*/


}

