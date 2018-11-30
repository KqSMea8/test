package com.vip.niexz.util;


import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jany.nie on 2018/9/18.
 */
public class SqlUtil {


    public Connection getConn(String DataBaseName) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://10.199.48.212:3306/"
                + DataBaseName;
        String username = "bfmysql";
        String password = "Apache";
        Connection conn = null;
        System.out.println("DataBaseName==========="+DataBaseName);
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接数据库成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void getSelect(String dbname,String sql) {
        Connection conn = getConn(dbname);
        try {
            Statement statement=conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("size=========="+resultSet.getRow());
            while (resultSet.next()) {
                System.out.println("next==========");
                System.out.println(resultSet.getString("agreement_id")+","+resultSet.getString("bankcard_no_p6s4"));
            }
        } catch (Exception e) {
        }
    }


    public static void main(String[] args) {

        SqlUtil t = new SqlUtil();
        String mdbname="bf_card_system01";
        String sql="select * from card_inner_agreement_person where fin_user_id='983349332'";
        t.getSelect(mdbname,sql);


    }
}
