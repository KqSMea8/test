package com.vip.niexz.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by jany.nie on 2018/9/18.
 */
public class CommonUtil {

    //上傳附件功能
    public static void getRobot(String path) {

        StringSelection sel = new StringSelection(path);
        // 把图片文件路径复制到剪贴板
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
        System.out.println("selection" + sel);
// 新建一个Robot类的对象
        try {
            Robot robot = new Robot();
            // 按下回车
            robot.keyPress(KeyEvent.VK_ENTER);
// 释放回车
            robot.keyRelease(KeyEvent.VK_ENTER);

// 按下 CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

// 释放 CTRL+V
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 点击回车 Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void TakesScreenshot(WebDriver driver, String picpath) {
        //截图功能

        //转换时间格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//获取当前时间
        String time = dateFormat.format(Calendar.getInstance().getTime());
//执行屏幕截取
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件;"截图"即时保存截图的文件夹
        try {
            FileUtils.copyFile(srcFile, new File(picpath, time + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void sleepTime(Long num){
        try {
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
