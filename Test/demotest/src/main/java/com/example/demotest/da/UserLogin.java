package com.example.demotest.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLogin {public static boolean checkUser(String username, String password)
{
    boolean kp =false;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:jdbc:mysql://localhost:3306/test1?serverTimezone=UTC", "root","");
        PreparedStatement ps = con.prepareStatement("select * from tbuser where username=? and password=?");
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs =ps.executeQuery();
        kp = rs.next();
    }
    catch(Exception e) {
        e.printStackTrace();
    }
    return kp;
}
}