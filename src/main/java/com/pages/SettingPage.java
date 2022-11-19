package com.pages;

import com.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SettingPage extends BaseClass {
    public static WebElement general;
    public static WebElement securityAndPrivacy;
    public static WebElement yourFacebookInfo;
    public static WebElement privacy;
    public static WebElement publicPosts;
    public static WebElement blocking;
    public static WebElement location;
    public static WebElement languageAndregion;
    public static WebElement stories;
    public static WebElement businessIntegration;


    public boolean verifyGeneralField(){
        general = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[1]"));
        return general.isEnabled();
    }
    public boolean verifySecurityAndPrivacyField(){
        securityAndPrivacy = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[2]"));
        return securityAndPrivacy.isEnabled();
    }
    public boolean verifyYourFacebookInfoField(){
        yourFacebookInfo = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[3]"));
        return yourFacebookInfo.isEnabled();
    }
    public boolean verifyPrivacyField(){
        privacy = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[4]"));
        return privacy.isEnabled();
    }
    public boolean verifyPublicPostsField(){
        publicPosts = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[6]"));
        return publicPosts.isEnabled();
    }
    public boolean verifyBlockingField(){
        blocking = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[7]"));
        return blocking.isEnabled();
    }
    public boolean verifyLocationField(){
        location = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[8]"));
        return location.isEnabled();
    }
    public boolean verifyLanguageAndRegionField(){
        languageAndregion = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[9]"));
        return languageAndregion.isEnabled();
    }
    public boolean verifyStoriesField(){
        stories = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[10]"));
        return stories.isEnabled();
    }
    public boolean verifyBusinessIntegrationField(){
        businessIntegration = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[16]"));
        return businessIntegration.isEnabled();
    }
}
