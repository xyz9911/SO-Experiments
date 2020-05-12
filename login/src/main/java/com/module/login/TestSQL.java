package com.module.login;

import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestSQL {
    @RequestMapping(value="test/get",method= RequestMethod.GET)
    public Object queryUser()
    {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/housing_system";
        String user="root";
        String password="Chh99116";
        Map<String,Object> map=new HashMap<String, Object>();
        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
            {
                System.out.println("connecting success");
            }
            Statement statement=con.createStatement();
            String sql="SELECT * FROM user";
            ResultSet resultSet=statement.executeQuery(sql);
            int id;
            String name,pass,gender,type,contact,city,district,add;
            List<Object> dataList=new ArrayList<Object>();
            resultSet.next();
            Map <String,Object> itemMap = new HashMap<String, Object>();
            id=resultSet.getInt("user_id");
            name=resultSet.getString("username");
            gender=resultSet.getString("gender");
            type=resultSet.getString("user_type");
            itemMap.put("id",id);
            itemMap.put("name",name);
            itemMap.put("gender",gender);
            itemMap.put("type",type);
            dataList.add(itemMap);
            resultSet.close();
            con.close();
            map.put("data",dataList);
            map.put("message","success");
            return map;
        }catch (SQLException e){
            System.out.println("connection failed");
        }catch (ClassNotFoundException e){
            System.out.println("driver not installed");
        }
        map.put("fuck","fail");
        return map;
    }
}
