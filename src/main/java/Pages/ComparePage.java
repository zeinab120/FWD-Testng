package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends PageBased{
    public ComparePage(WebDriver driver) {
        super(driver);
    }


        @FindBy(tagName = "tr")
        public List<WebElement> allRows;

        @FindBy(tagName = "td")
        public List<WebElement> allCol;

        @FindBy(linkText="HTC One M8 Android L 5.0 Lollipop")
        public WebElement firstProductName;

        @FindBy(linkText="Apple MacBook Pro 13-inch")
        public WebElement secodProductName ;


        public void CompareProducts()
        {
            // Get all Rows
            System.out.println(allRows.size());
            // Get data from each Row
            for(WebElement row : allRows)
            {
                System.out.println(row.getText() + "\t");
                for(WebElement col : allCol)
                {
                    System.out.println(col.getText()+"\t");
                }
            }
        }

    }