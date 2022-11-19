package com.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public  Properties prop;
    public static final WebDriver driver = new ChromeDriver();

    public void testBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("C:\\Users\\HP\\IdeaProjects\\Facebook_POM\\src\\main\\java\\com\\facebook\\qa\\config\\Config_Data.properties"));
            try {
                prop.load(ip);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setProperties() {
        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}