package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;

import java.util.List;

public class HoverCategorythenTagColorTest extends TestBasedShared
{
    HomePage homeObject ;

    @Test(priority = 1)
    public void UserCanSelectSubCategoryFromMainMenu() {
        homeObject = new HomePage(driver);
        homeObject.selectCategoryMenu();

       // Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
    }
        @Test(priority = 2)
        public void SelectTag () {
            homeObject.SelectTagAndAssert();
            Assert.assertTrue(homeObject.ProductTag.getText().contains("computer"));

          //  Assert.assertTrue(homeObject.pageTitleTag.getText().contains("computer"));
        }

    @Test(priority = 3)
    public void FilterWithColor(){
        homeObject.selectCategoryMenu();
        homeObject.FilterColor();

    }
    }


