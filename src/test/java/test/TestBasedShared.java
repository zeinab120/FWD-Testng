package test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBasedShared {
   // WebDriver driver=null;
    public static WebDriver driver;

    @BeforeSuite
    @Parameters({"browser"})

    public void OpenDriver(@Optional("chrome") String browserName) throws InterruptedException {
       if (browserName.equalsIgnoreCase("chrome")) {
          // WebDriver driver = null;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            driver.navigate().to("https://demo.nopcommerce.com/");

        }
    }
    @AfterSuite
    public void CloseDriver(){
      driver.quit();
    }


}
