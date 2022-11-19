package com.crossbrowsertesting;

import com.pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossBrowserTest {
    public static final LogInPage loginpage = new LogInPage();
    public static WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","C:\\Selenium\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else{
            throw new Exception("Incorrect Browser");
        }

    }
    @Test()
    public void verifyIdTextField() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
