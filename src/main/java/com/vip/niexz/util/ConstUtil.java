package com.vip.niexz.util;

/**
 * Created by jany.nie on 2018/11/27.
 */
public class ConstUtil {

    public static final String h52fact_url="https://mi.vipsfin.com/realname_2fact.html?req_systemId=mocktestH5&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html";

    public static final String h54fact_url="https://mi.vipsfin.com/realname_method.html?req_systemId=mocktestH5&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html";

    public static final String h5level_url="https://mlogin.vip.com/asserts/login/login.html?f=vipsfin&callback=https%3A%2F%2Fauths.vipsfin.com%2Fh5%2Fgo%3Ftarge_url%3Dhttps%253A%252F%252Fmi.vipsfin.com%252Frealname_level.html";

    public static  final String h5up_idcard="https://mi.vipsfin.com/realname_idcard.html?req_systemId=mocktestH5&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html";



    public static final String pclevel_url="https://passport.vip.com/login?whereFrom=vipsfin&src=https%3A%2F%2Fauths.vipsfin.com%2Fpc%2Fgo%3Ftarge_url%3Dhttps%253A%252F%252Fmember.vipsfin.com%252Frealname.html";


    public  static final String pc2fact_url="https://passport.vip.com/login?whereFrom=vipsfin&src=https%3A%2F%2Fauths.vipsfin.com%2Fpc%2Fgo%3Ftarge_url%3Dhttps%253A%252F%252Fmember.vipsfin.com%252Frealname_2fact.html%253Freq_systemId%253DmocktestPC%2526callbackUrl%253Dhttps%25253a%25252f%25252fmember.vipsfin.com%25252frealname.html";



    public static final String pcup_idcard="https://passport.vip.com/login?whereFrom=vipsfin&src=https%3A%2F%2Fauths.vipsfin.com%2Fpc%2Fgo%3Ftarge_url%3Dhttps%253A%252F%252Fmember.vipsfin.com%252Frealname_upload.html%253Freq_systemId%253DmocktestPC%2526callbackUrl%253Dhttps%25253a%25252f%25252fmember.vipsfin.com%25252frealname.html";

    public static String getPc2fact_url() {
        return pc2fact_url;
    }
    public static String getPclevel_url() {
        return pclevel_url;
    }

    public static String getH52fact_url() {
        return h52fact_url;
    }

    public static String getH54fact_url() {
        return h54fact_url;
    }
    public static String getH5level_url() {
        return h5level_url;
    }
    public static String getH5up_idcard() {
        return h5up_idcard;
    }
    public static String getPcup_idcard() {
        return pcup_idcard;
    }

}
