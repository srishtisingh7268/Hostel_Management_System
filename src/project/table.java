/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ashutosh Singh
 */
public class table {
     public static void main(String[] args)
    {
        Connection con =null;
        Statement st =null;
        try
        {
            con= ConnectionProvider.getCon();
            st= con.createStatement();
            st.executeUpdate("create table student (id int, name varchar(200),mobileno varchar(20),Gender varchar(50),email varchar(200),Address varchar(500),startdate date, bed  varchar(200),roomtype  varchar(200),roomNo varchar(200), Price varchar(2000))");
            st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestions varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
            st.executeUpdate("create table rooms(roomNo varchar(10),roomType varchar(200),bed varchar(200),price varchar(1000), status varchar(20))");
 st.executeUpdate("create table employees(name varchar(200),email varchar(200),password varchar(50),securityQuestions varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
          try
          {
              con.close();
              st.close();
          }
        catch(Exception e){}   
        }
        
        
    }
    
}
