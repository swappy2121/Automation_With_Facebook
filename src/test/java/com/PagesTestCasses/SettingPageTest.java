package com.PagesTestCasses;

import com.baseclass.BaseClass;
import com.pages.SettingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingPageTest extends BaseClass {
    public static final SettingPage settingPage = new SettingPage();

    public SettingPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp() {
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        Actions action = new Actions(driver);
        WebElement logo = driver.findElement(By.cssSelector("image[style='height:40px;width:40px']"));
        action.moveToElement(logo).perform();
    }

    @Test(priority = 1)
    public void verifyGeneralFieldOfPage(){
        boolean generalField = settingPage.verifyGeneralField();
        Assert.assertTrue(generalField);
    }
    @Test(priority = 2)
    public void verifySecurityAndPrivacyFieldOfPage() {
        boolean securityAndPrivacyField = settingPage.verifySecurityAndPrivacyField();
        Assert.assertTrue(securityAndPrivacyField);
    }
    @Test(priority = 3)
    public void verifyFacebookInfoOfPage() {
        boolean facebookInfoField = settingPage.verifyYourFacebookInfoField();
        Assert.assertTrue(facebookInfoField);
    }
    @Test(priority = 4)
    public void verifyPrivacyFieldOfPage() {
        boolean privacyField = settingPage.verifyPrivacyField();
        Assert.assertTrue(privacyField);
    }
    @Test(priority = 5)
    public void verifyPublicPostsOfPage() {
        boolean publicPostsField = settingPage.verifyPublicPostsField();
        Assert.assertTrue(publicPostsField);
    }
    @Test(priority = 6)
    public void verifyBlockingFieldOfPage() {
        boolean blockingField = settingPage.verifyBlockingField();
        Assert.assertTrue(blockingField);
    }
    @Test(priority = 7)
    public void verifyLocationFieldOfPage() {
        boolean locationOfField = settingPage.verifyLocationField();
        Assert.assertTrue(locationOfField);
    }
    @Test(priority = 8)
    public void verifyLanguageAndRegionFieldOfSignUpPage() {
        boolean languageAndRegion = settingPage.verifyLanguageAndRegionField();
        Assert.assertTrue(languageAndRegion);
    }
    @Test(priority = 9)
    public void verifyStoriesofPage() {
        boolean storiesField = settingPage.verifyStoriesField();
        Assert.assertTrue(storiesField);
    }
    @Test(priority = 10)
    public void verifyBusinessIntegrationFieldOfPage() {
        boolean businessIntegrationField = settingPage.verifyBusinessIntegrationField();
        Assert.assertTrue(businessIntegrationField);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}

