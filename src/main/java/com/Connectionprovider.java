package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MAYANK MISHRA
 */
public class Connectionprovider {
    public static Connection getCon() throws ClassNotFoundException, SQLException{
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/idusnewjava","root","MAYANK#1324");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
