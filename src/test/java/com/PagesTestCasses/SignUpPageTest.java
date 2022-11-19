package com.PagesTestCasses;

import com.baseclass.BaseClass;
import com.pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseClass {
    public final SignUpPage signPage = new SignUpPage();

    public SignUpPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.findElement(By.linkText("Create New Account")).click();
    }

    @Test(groups= {"Smoke_test"})
    public void verifyFirstNameOfSignUpPage(){
        String Name1 = signPage.verifyFirstNameField();
        Assert.assertEquals(Name1,"Swapnil");
    }
    @Test(priority = 1)
    public void verifyLastNameOfSignUpPage(){
        String Name2 = signPage.verifyLastNameField();
        Assert.assertEquals(Name2,"Pawar");
    }
    @Test(priority = 2)
    public void verifyEmailFieldOfSignUpPage(){
        String email = signPage.verifyEmailTextField();
        Assert.assertEquals(email,"swapnilPawar25@gmail.com");
    }
    @Test(priority = 3)
    public void verifypassFieldOfSignUpPage(){
        String pass = signPage.verifyPasswordTextField();
        Assert.assertEquals(pass,"Swappy@2524");
    }
    @Test(priority = 4)
    public void verifyBirthDayFieldOfSignUpPage(){
        String birth_Day = signPage.verifyBirthDayField();
        Assert.assertEquals(birth_Day,"5");
    }
    @Test(priority = 5)
    public void verifyBirthMonthFieldOfSignUpPage(){
        String birth_Month = signPage.verifyBirthmonthField();
        Assert.assertEquals(birth_Month,"9");
    }
    @Test(priority = 6)
    public void verifyBirthYearFieldOfSignUpPage(){
        String birth_Year = signPage.verifyBirthYearField();
        Assert.assertEquals(birth_Year,"1999");
    }
    @Test(priority = 7)
    public void verifyGenderFieldOfSignUpPage(){
        String gender = signPage.verifyGenderField();
        Assert.assertEquals(gender,"2");
    }
    @Test(priority = 8)
    public void verifySubmitbtnOfSignUpPage(){
        boolean subBtn = signPage.verifySignUpBtnField();
        Assert.assertTrue(subBtn);
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}

