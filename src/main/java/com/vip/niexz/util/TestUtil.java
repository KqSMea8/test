package com.vip.niexz.util;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Created by jany.nie on 2018/10/31.
 */
public class TestUtil {


    @Test
    public void h5TwoFactor() {
        operateUtil loginin1=new operateUtil();
        String Loginid="181128117706@dct.com";
        String password="abcd1234";
        String username="刘志福";
        String idNo="230603200901148493";
        String url=ConstUtil.getH52fact_url();
        WebDriver webdriver=loginin1.LoginPortal(Loginid,password,url);
        loginin1.h5realname_2fact(webdriver,username,idNo);
    }

    @Test
    public void h5level() {
        operateUtil loginin1=new operateUtil();
        String Loginid="181128117706@dct.com";
        String password="abcd1234";
        String url=ConstUtil.getH5level_url();
        WebDriver webdriver=loginin1.LoginPortal(Loginid,password,url);
    }

    @Test
    public void h5up_idcard(){
        operateUtil loginin1=new operateUtil();
        String Loginid="181128150112@dct.com";
        String password="abcd1234";
        String url=ConstUtil.getH5up_idcard();
        WebDriver driver=loginin1.LoginPortal(Loginid,password,url);
        CommonUtil.sleepTime((long)2000);
        loginin1.h5upidcard(driver,"E:\\tool\\files\\b.jpg","E:\\tool\\files\\a.jpg");

    }

    @Test
    public void pclevel(){
        operateUtil loginin1=new operateUtil();
        String Loginid="181128117706@dct.com";
        String password="abcd1234";
        String url=ConstUtil.getPclevel_url();
        WebDriver webdriver=loginin1.LoginPCPortal(Loginid,password,url);

    }

    @Test
    public void pc2fact(){
        operateUtil loginin1=new operateUtil();
        String Loginid="181128117706@dct.com";
        String password="abcd1234";
        String username="周立即";
        String idNo="21130219791006489X";
        String url=ConstUtil.getPc2fact_url();
        WebDriver webdriver=loginin1.LoginPCPortal(Loginid,password,url);
        loginin1.pc2fact(webdriver,username,idNo);

    }

    @Test
    public void pcup_idcard(){
        operateUtil loginin1=new operateUtil();
        String Loginid="18811111113";
        String password="abcd1234";
        String url=ConstUtil.getPcup_idcard();
        WebDriver driver=loginin1.LoginPCPortal(Loginid,password,url);
        CommonUtil.sleepTime((long)2000);
        loginin1.pcupidcard(driver,"E:\\tool\\files\\4-16A.PNG.jpg","E:\\tool\\files\\4-16B.PNG.jpg");
    }



}
