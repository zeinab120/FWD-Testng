package test;

import Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;


public class F2_SearchTest extends TestBasedShared {
    HomePage homeObject;

    RegistrationPage registrationObject;
    SearchPage searchObject;
    PasswordRecoveryPage PRobject;

        SearchArrayPage Search_Array_Object;
        Random rand = new Random();
        int number = rand.nextInt(100);
        public String userName = "Zeinab" + number;
        public String userEmail = userName + "@gmail.com";

        @Test
        public void user_search_with_name_of_product()
        {
            driver.findElement(By.id("small-searchterms")).sendKeys("book");
            driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();

        }
    @Test
    public void user_could_find_relative_results() {
        int count = driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count; x++) {
            System.out.println(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            //Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));

        }
    }
        @Test
        public void ChangeCurrency() {
        homeObject = new HomePage(driver);
        homeObject.ChangCurency();
        // searchObject = new SearchPage(driver);
        Search_Array_Object=new SearchArrayPage(driver);
        //searchObject.SearchPage("Mac");
        Assert.assertTrue(homeObject.productPrice.getText().contains("€"));
    }
    }



