package com.PagesTestCasses;

import com.baseclass.BaseClass;
import com.pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends BaseClass {
    public static final HomePage homepage = new HomePage();

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.id("loginbutton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void verifySearchFieldInHomePage(){
        boolean searchField = homepage.verifySearchFieldOfHomePage();
        Assert.assertTrue(searchField);
    }
    @Test(priority = 2)
    public void verifyMenuFieldLogoInHomePage(){
        boolean logoOfMenu = homepage.verifyMenuFieldLogo();
        Assert.assertTrue(logoOfMenu);
    }
    @Test(priority = 4)
    public void verifyFriendsFieldOfHomePage(){
        boolean friendField = homepage.verifyFriendsField();
        Assert.assertTrue(friendField);
    }
    @Test(priority = 5)
    public void verifyGroupsFieldOfPage(){
        boolean groupsField = homepage.verifyGroupsField();
        Assert.assertTrue(groupsField);
    }
    @Test(priority = 6)
    public void verifyCreateNewGroupFieldOfPage(){
        boolean createNewGroupField = homepage.verifyCreateNewGroupField();
        Assert.assertTrue(createNewGroupField);
    }
    @Test(priority = 7)
    public void verifyCreateNewGroupPlusIconOfPage(){
        boolean icon = homepage.verifyCreateNewGroupPlusIcon();
        Assert.assertTrue(icon);
    }
    @Test(priority = 8)
    public void verifyMessengerFieldOfPage(){
        boolean searchField = homepage.verifyMessengerField();
        Assert.assertTrue(searchField);
    }
    @Test(priority = 9)
    public void verifyPlusIconOfHomePage(){
        boolean shareMomentsIcon = homepage.verifyShareMomentsIconField();
        Assert.assertTrue(shareMomentsIcon);
    }
    @Test(priority = 10)
    public void verifyNotificationsLinkOfHomePage(){
        boolean linkOfNotifications = homepage.verifyNotificatonsField();
        Assert.assertTrue(linkOfNotifications);
    }
    @AfterTest
    public void closeBrowsers(){

    }
}

