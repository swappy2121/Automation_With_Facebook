package com.PagesTestCasses;

import com.baseclass.BaseClass;
import com.pages.LogInPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInPageTest extends BaseClass {
    public static final LogInPage loginpage = new LogInPage();

    public LogInPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
    }

    @Test(groups= {"Smoke_test"})
    public void verifyId2TextField(){
        boolean userName2 = loginpage.verifyUserId2TextField();
        Assert.assertTrue(userName2);
    }
    @Test(priority = 1)
    public void verifyIdTextField(){
        String userName = loginpage.verifyUserId1TextField();
        Assert.assertEquals(userName,"sopiakshu25@gmail.com");
    }
    @Test(priority = 2)
    public void verifyPasswordOfLogInPage(){
        String passLogIn1 = loginpage.verifyPass1TextFieldOfLogInPage();
        Assert.assertEquals(passLogIn1,"Sopi@1234");
    }
    @Test(priority = 3)
    public void verifyPasswordOfLogInPage2(){
        boolean passLogIn2 = loginpage.verifyPass2TextFieldOfLogInPage();
        Assert.assertTrue(passLogIn2);
    }
    @Test(priority = 4)
    public void verifyBtnOfLogInPage1(){
        boolean button1 = loginpage.verifyLogInBtn1();
        Assert.assertTrue(button1);
    }
    @Test(priority = 5)
    public void verifyBtnOfLogInPage2(){
        boolean button2 = loginpage.verifyLogInBtn2();
        Assert.assertTrue(button2);
    }
    @Test(priority = 6)
    public void verifyForgottenLinkOfPage(){
        String forgotLink = loginpage.verifyForgotPassLink();
        Assert.assertEquals(forgotLink,"https://www.facebook.com/#");
    }
    @Test(priority = 7)
    public void verifyCreateAccBtnEnabledOrNotOfPage(){
        boolean Btn = loginpage.verifyCreateAccountBtnEnabled();
        Assert.assertTrue(Btn);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}

