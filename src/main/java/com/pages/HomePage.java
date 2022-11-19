package com.pages;

import com.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
    public static WebElement search;
    public static WebElement logo;
    public static WebElement menu;
    public static WebElement friends;
    public static WebElement groups;
    public static WebElement createNewGroup;
    public static WebElement plusIcon;
    public static WebElement messenger;
    public static WebElement iconOfShareMoments;
    public static WebElement addPictures;

    public boolean verifySearchFieldOfHomePage() {
        search = driver.findElement(By.xpath("//input[contains(@class,'x1i10hfl xggy1nq x1s07b3s x1kdt53j x1yc453h xhb22t3 xb5gni xcj1dhv x2s2ed0 xq33zhf xjyslct xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou xnwf7zb x40j3uw x1s7lred x15gyhx8 x9f619 xzsf02u xdl72j9 x1iyjqo2 xs83m0k xjb2p0i x6prxxf xeuugli x1a2a7pz x1n2onr6 x15h3p50 xm7lytj x1sxyh0 xdvlbce x1vqgdyp x1q6du2z x12wi22r x8du52y x1lsgon3 x3ku6tv x9rwgsp xo6swyp x1ad04t7 x1glnyev x1ix68h3 x19gujb8')]"));
        return search.isDisplayed();
    }
    public boolean verifyMenuFieldLogo() {
        logo = driver.findElement(By.xpath("(//div[@class='qmqpeqxj e7u6y3za qwcclf47 nmlomj2f i85zmo3j frfouenu bonavkto djs4p424 r7bn319e bdao358l fxk3tzhb jcxyg2ei om3e55n1 a5wdgl2o h7q9eq3y iryl7rsq'])[1]"));
        return logo.isDisplayed();
    }
    public boolean verifyFriendsField() {
        friends = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[5]"));
        return friends.isDisplayed();
    }
    public boolean verifyGroupsField() {
        groups = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[2]"));
        return groups.isEnabled();
    }
    public boolean verifyCreateNewGroupField() {
        createNewGroup = driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q')])[3]"));
        return createNewGroup.isEnabled();
    }
    public boolean verifyCreateNewGroupPlusIcon() {
        plusIcon = driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken tr46kb4q'])[3]"));
        return plusIcon.isDisplayed();
    }
    public boolean verifyMessengerField() {
        messenger = driver.findElement(By.xpath("(//div[@class='qi72231t n3hqoq4p r86q59rh b3qcqh3k fq87ekyn fsf7x5fv s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk cr00lzj9 rn8ck1ys s3jn8y49 f14ij5to l3ldwz01 icdlwmnq i85zmo3j qmqpeqxj e7u6y3za qwcclf47 nmlomj2f frfouenu bonavkto djs4p424 r7bn319e bdao358l alzwoclg jcxyg2ei srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 nq2b4knc bis24fgy a5wdgl2o'])"));
        return messenger.isEnabled();
    }
    public boolean verifyShareMomentsIconField() {
        iconOfShareMoments = driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[3]"));
        return iconOfShareMoments.isEnabled();
    }
    public boolean verifyNotificatonsField() {
        addPictures = driver.findElement(By.xpath("(//span)[58]"));
        return addPictures.isEnabled();
    }
}
