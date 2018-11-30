package com.vip.niexz.util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jany.nie on 2018/10/31.
 */
public class operateUtil{

    public WebDriver LoginPortal(String Loginid,String password,String url){
        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点身份证上传页面
        driver.get(url);
        driver.findElement(By.xpath(".//*[@id=\"J-models-login-wrap\"]/div[5]/fieldset/a")).click();
        WebElement element1 = driver.findElement(By.name("username"));
        element1.sendKeys(Loginid);
        WebElement element2 = driver.findElement(By.name("password"));
        element2.sendKeys(password);
        CommonUtil.sleepTime((long)2000);
        //登录
        driver.findElement(By.xpath("//*[@id=\"J-models-login-wrap\"]/div[4]/form/div[1]/div[3]/a")).click();
        CommonUtil.sleepTime((long)2000);
        return  driver;
    }





    public WebDriver LoginPCPortal(String Loginid,String password,String url) {
        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点身份证上传页面
        driver.get(url);
        CommonUtil.sleepTime((long)2000);

        WebElement element1 = driver.findElement(By.name("loginName"));
        element1.sendKeys(Loginid);
        WebElement element2 = driver.findElement(By.name("password"));
        element2.sendKeys(password);
        WebElement element3= driver.findElement(By.xpath("//*[@id=\"J_login_form\"]/div[6]/div[1]/div[1]/label"));
        element3.click();
        CommonUtil.sleepTime((long)1000);
        //登录
        driver.findElement(By.xpath("//*[@id=\"J_login_submit\"]")).click();
        CommonUtil.sleepTime((long)2000);
        return  driver;


    }


    public void h5realname_2fact(WebDriver driver,String username,String idNo){
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"PayRefund\"]/div/div[2]/div[1]/div[1]/div[2]/input"));
        element1.sendKeys(username);
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"PayRefund\"]/div/div[2]/div[1]/div[2]/div[2]/input"));
        element2.sendKeys(idNo);
        driver.findElement(By.xpath("//*[@id=\"PayRefund\"]/div/div[2]/div[3]/a")).click();

    }


    public void pc2fact(WebDriver driver,String username,String idNo){
        WebElement element1 = driver.findElement(By.name("realName"));
        element1.sendKeys(username);
        WebElement element2 = driver.findElement(By.name("idNo"));
        element2.sendKeys(idNo);
        driver.findElement(By.id("btn-realname")).click();

    }
    public void pcupidcard(WebDriver driver,String zmpath,String fmpath){
        //弹出选择照片框
        driver.findElement(By.xpath("//*[@id=\"frontFrom\"]/div[1]/label/div[1]")).click();
        CommonUtil.sleepTime((long)1000);
        //调用robot
        CommonUtil.getRobot(zmpath);
        CommonUtil.sleepTime((long)2000);
        //身份证正面照背面-----------------------------
        driver.findElement(By.xpath("//*[@id=\"frontFrom\"]/div[2]/label/div[1]")).click();
        CommonUtil.sleepTime((long)2000);
        //调用robot
        CommonUtil.getRobot(fmpath);
        CommonUtil.sleepTime((long)2000);
        driver.findElement(By.xpath("//*[@id=\"upCard\"]/span[1]")).click();
        CommonUtil.sleepTime((long)2000);
        CommonUtil.TakesScreenshot(driver, "jietu");
    }

    public void h5upidcard(WebDriver driver,String zmpath,String fmpath){
        //弹出选择图片按钮
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[2]/div[1]")).click();
        CommonUtil.sleepTime((long)1000);
        //弹出选择照片框
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[6]/div[1]/div")).click();
        //身份证正面照上传-----------------------------
        //调用robot
        CommonUtil.getRobot(zmpath);
        CommonUtil.sleepTime((long)2000);
        //身份证正面照背面-----------------------------
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[2]/div[2]")).click();
        CommonUtil.sleepTime((long)2000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[6]/div[1]/div")).click();
        CommonUtil.sleepTime((long)2000);
        //调用robot
        CommonUtil.getRobot(fmpath);
        CommonUtil.sleepTime((long)2000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[3]/a")).click();
        CommonUtil.sleepTime((long)2000);
        CommonUtil.TakesScreenshot(driver, "jietu");
    }
}
