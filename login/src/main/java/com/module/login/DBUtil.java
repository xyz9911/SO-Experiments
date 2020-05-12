package com.module.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws SQLException,ClassNotFoundException
    {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/housing_system";
        String user="root";
        String password="Chh99116";
        Class.forName(driver);
        con= DriverManager.getConnection(url,user,password);
        return con;
    }

    public static void close(Connection con)throws SQLException
    {
        if(con!=null)
        {
            con.close();
        }
    }
}
