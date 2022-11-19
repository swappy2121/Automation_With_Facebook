package com.PagesTestCasses;

import com.baseclass.BaseClass;
import com.pages.ProfilePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseClass {
    public static final ProfilePage profilePage = new ProfilePage();

    public ProfilePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        driver.get("https://www.facebook.com/profile.php?id=100085138144054");
    }
    @Test(priority = 1)
    public void verifyPostsFieldForProfilePage(){
        String postField = profilePage.verifyPostsField();
        Assert.assertEquals(postField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo");
    }
    @Test(priority = 2)
    public void verifyAboutFieldLogoInProfilePage(){
        String aboutField  = profilePage.verifyAboutField();
        Assert.assertEquals(aboutField,"https://www.facebook.com/profile.php?id=100085138144054");
    }
    @Test(priority = 3)
    public void verifySearchFieldForProfilePage(){
        boolean searchField = profilePage.verifySearchField();
        Assert.assertTrue(searchField);
    }
    @Test(priority = 4)
    public void verifyFriendsFieldOfProfilePage(){
        boolean friendField = profilePage.verifyFriendsField();
        Assert.assertTrue(friendField);
    }
    @Test(priority = 5)
    public void verifyPhotosFieldOfPage(){
        boolean photosField = profilePage.verifyPhotosField();
        Assert.assertTrue(photosField);
    }
    @Test(priority = 6)
    public void verifyvideosFieldOfPage() {
        boolean videosField = profilePage.verifyVideosField();
        Assert.assertTrue(videosField);
    }
    @Test(priority = 7)
    public void verifyCheck_InFieldOfPage(){
        boolean checkInField = profilePage.verifyCheck_InField();
        Assert.assertTrue(checkInField);
    }
    @Test(priority = 8)
    public void verifyAddStoryFieldOfPage(){
        boolean addStoryField = profilePage.verifyAddStoryField();
        Assert.assertTrue(addStoryField);
    }
    @Test(priority = 9)
    public void verifyEditDetailsFieldOfProfilePage(){
        boolean editProfileDetails = profilePage.verifyEditProfileDetailsField();
        Assert.assertTrue(editProfileDetails);
    }
    @Test(priority = 10)
    public void verifyAddCoverPhotosFieldOfProfilePage(){
        boolean addCoverPhotos = profilePage.verifyAddCoverPhotosField();
        Assert.assertTrue(addCoverPhotos);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}
