package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.Random;

public class PageBased {
    protected WebDriver driver; // use in TCS
    //create constructor the same name of page without void
    public Actions actions;
    public PageBased(WebDriver driver){ //parameter to pass pageObject
        PageFactory.initElements(driver,this);
    }


    public static void ClickButton(WebElement button){ //Static bec not take object from class
    button.click();
}

public static void SendTxtFields(WebElement TxtField, String value){
        TxtField.sendKeys(value);
}



}


