package com.vip.niexz.util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by jany.nie on 2018/10/29.
 */
public class CookiesUtil {

    @Test
    public void setLogin() {
        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);


        CommonUtil.sleepTime((long)2000);
        // get()打开一个站点身份证上传页面
        driver.get("https://mi.vipsfin.com/realname_idcard.html?req_systemId=mocktestH5photo&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html");
        CommonUtil.sleepTime((long)2000);
        Cookie c1 = new Cookie("fso", "VPAL.zwieV5Yuv8bAfY6EjZe63ETYXfXEkK","/");
        Cookie c2 = new Cookie("fsid", "pGIiEigeutsWP2fPBrytcrWKTSagro","/");
        Cookie c3 = new Cookie("fvid", "e8aEJ6xaQR1AOGaY1ba4IrKF6vfNSKcvT69y","/");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);
        driver.manage().addCookie(c3);
    }


    @Test
   public void setLoginCookies() {
        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Cookie c1 = new Cookie("fso", "VPAL.zwieV5Yuv8bAfY6EjZe63ETYXfXEkK","/");
        Cookie c2 = new Cookie("fsid", "pGIiEigeutsWP2fPBrytcrWKTSagro","/");
        Cookie c3 = new Cookie("fvid", "e8aEJ6xaQR1AOGaY1ba4IrKF6vfNSKcvT69y","/");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);
        CommonUtil.sleepTime((long)2000);
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
        CommonUtil.sleepTime((long)5000);
        //获得cookie
      Set<Cookie> coo = driver.manage().getCookies();
    //打印cookie
        System.out.println(coo);
    }


    @Test
    public void setCookies(){

        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.youdao.com");
        Cookie c1 = new Cookie("name", "key-aaaaaaa");
        Cookie c2 = new Cookie("value", "value-bbbbbb");
        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);
        System.out.println(driver.manage().getCookies());
        //删除所有cookie
       // driver.manage().deleteAllCookies();
        //获得cookie
        Set<Cookie> coo = driver.manage().getCookies();
        //打印cookie
        System.out.println(coo);
       //driver.quit();

    }
    @Test
    public void setAlert(){
        //处理Alert弹窗

    }
}
