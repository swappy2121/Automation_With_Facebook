package com.pages;

import com.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends BaseClass {
    public static String titleOfLogInPage;
    public static WebElement userId1;
    public static WebElement userId2;
    public static WebElement pass1;
    public static WebElement pass2;
    public static WebElement logInBtn1;
    public static WebElement logInBtn2;
    public static WebElement forgotPassLink;
    public static WebElement createAcBtn1;
    public static WebElement Btn1;

    public String verifyTitleOfLogInPage() {
        titleOfLogInPage = driver.getTitle();
        return titleOfLogInPage;
    }

    public String verifyUserId1TextField() {
        userId1 = driver.findElement(By.name("email"));
        if (userId1.isEnabled()) {
            userId1.sendKeys("sopiakshu25@gmail.com");
        }
        return userId1.getAttribute("value");
    }

    public boolean verifyUserId2TextField() {
        userId2 = driver.findElement(By.name("email"));
        return userId2.isDisplayed();
    }

    public boolean verifyPass2TextFieldOfLogInPage() {
        pass2 = driver.findElement(By.id("pass"));
        return pass2.isDisplayed();
    }

    public String verifyPass1TextFieldOfLogInPage() {
        pass1 = driver.findElement(By.id("pass"));
        if (pass1.isEnabled()) {
            pass1.sendKeys("Sopi@1234");
        }
        return pass1.getAttribute("value");
    }

    public boolean verifyLogInBtn1() {
        logInBtn1 = driver.findElement(By.name("login"));
        return logInBtn1.isDisplayed();
    }

    public boolean verifyLogInBtn2() {
        logInBtn2 = driver.findElement(By.name("login"));
        return logInBtn2.isEnabled();
    }

    public String verifyForgotPassLink() {
        forgotPassLink = driver.findElement(By.xpath("(//a)[1]"));
        return forgotPassLink.getAttribute("href");
    }

    public boolean verifyCreateAccountBtnEnabled() {
        Btn1 = driver.findElement(By.linkText("Create New Account"));
        return Btn1.isEnabled();
    }

    public SignUpPage verifyCreateAccountBtn() {
        createAcBtn1 = driver.findElement(By.linkText("Create New Account"));
        createAcBtn1.click();
        return new SignUpPage();
    }

    public HomePage verifyLogInField(String UN, String passW) {
        userId1 = driver.findElement(By.name("email"));
        pass1 = driver.findElement(By.id("pass"));
        logInBtn1 = driver.findElement(By.name("login"));
        userId1.sendKeys(UN);
        pass1.sendKeys(passW);
        logInBtn1.click();
        return new HomePage();
    }
}
