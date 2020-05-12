package com.module.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.util.Password;

import javax.validation.constraints.Null;
import java.sql.*;

public class UserOperations {

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(value = "username")String username,@RequestParam(value = "password")String key)throws SQLException,ClassNotFoundException
    {
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        con=DBUtil.getConnection();
        ps=con.prepareStatement("select * from user where username=?");
        ps.setString(1,username);
        rs=ps.executeQuery();
        while(rs.next())
        {
            String password=rs.getString("password");
            String id=rs.getString("user_id");
            if(key.equals(password))
            {
                return '1'+id;
            }
            else
                return "-1";//password mismatch
        }
        return "0";//no such user
    }

    //@RequestMapping(value = "create_user",method = RequestMethod.POST)
    //public String createUser(@RequestParam(value = "username")String username, @RequestParam(value = "password")String password, @RequestParam(value="gender")String gender, @RequestParam(value = "user_contact")String contact, @RequestParam(value = "user_city")String city,@RequestParam(value = "user_district")String district,@RequestParam(value = "user_address")String address)throws SQLException,ClassNotFoundException
    //{
    //    Connection con;
    //    PreparedStatement ps;
    //    ResultSet rs;
    //    con=DBUtil.getConnection();
    //    ps=con.prepareStatement("select * from user where username=?");
    //    ps.setString(1,username);
    //    rs=ps.executeQuery();
    //    if(rs.)
    //}
}
