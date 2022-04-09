package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBased {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    HomePage homeObject;

    @FindBy(id = "small-searchterms")
    WebElement searchTxtInput;
    @FindBy(css = "div.item-box")
    WebElement searchResult;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchButton;

    @FindBy(id="ui-id-1")
    List<WebElement> ProductList ;


 /*   public void SearchPage(String productName) {
        //search
        //searchTxtInput.sendKeys("Mac");
        SendTxtFields(searchTxtInput,productName);
        ClickButton(searchButton);

        //click on product to redirect to details page
       searchResult.click();
        //ProductList.get(0).click();

    }*/
 public void SearchPage(String productName)
 {
     SendTxtFields(searchTxtInput, productName);
     try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     ProductList.get(0).click();
 }
}