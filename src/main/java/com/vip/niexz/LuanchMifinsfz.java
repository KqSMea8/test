package com.vip.niexz;


import com.vip.niexz.util.CommonUtil;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jany.nie on 2018/9/10.
 */
public class LuanchMifinsfz {

    //身份证上传页面
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点身份证上传页面
        driver.get("https://mi.vipsfin.com/realname_idcard.html?req_systemId=mocktestH5photo&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html");
        driver.findElement(By.xpath(".//*[@id=\"J-models-login-wrap\"]/div[5]/fieldset/a")).click();


        WebElement element1 = driver.findElement(By.name("username"));
        element1.sendKeys("18811111113");
        WebElement element2 = driver.findElement(By.name("password"));
        element2.sendKeys("abcd1234");
        CommonUtil.sleepTime((long)2000);
        //登录
        driver.findElement(By.xpath("//*[@id=\"J-models-login-wrap\"]/div[4]/form/div[1]/div[3]/a")).click();
        CommonUtil.sleepTime((long)2000);
        //弹出选择图片按钮
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[2]/div[1]")).click();
        CommonUtil.sleepTime((long)2000);
        //弹出选择照片框
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[6]/div[1]/div")).click();
        //身份证正面照上传-----------------------------
        //调用robot
        CommonUtil.getRobot("E:\\tool\\files\\4-16A.PNG.jpg");
        CommonUtil.sleepTime((long)2000);
        //身份证正面照背面-----------------------------
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[2]/div[2]")).click();
        CommonUtil.sleepTime((long)2000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[6]/div[1]/div")).click();
        CommonUtil.sleepTime((long)2000);
        //调用robot
        CommonUtil.getRobot("E:\\tool\\files\\4-16B.PNG.jpg");
        CommonUtil.sleepTime((long)2000);
        driver.findElement(By.xpath("//*[@id=\"account\"]/div/div[2]/div[3]/a")).click();
        CommonUtil.sleepTime((long)2000);
        CommonUtil.TakesScreenshot(driver, "jietu");
       // driver.quit();

    }

}
