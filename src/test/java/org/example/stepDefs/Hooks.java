package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver= null;

    @Before
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\demonopcommerce\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get("https://demo.nopcommerce.com/");
    }

   /* @After
    public static void closeBrowser(){
        driver.quit();
    }*/


}
