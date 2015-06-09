/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author the 12
 */
public class konek {
  
 private static Connection mysqlkonek;
 public static Connection koneksiDB() throws SQLException{
 
 
 if(mysqlkonek==null){
 try {
 String url="jdbc:mysql://localhost:3306/login";
 String user="root";
 String pass="";
 
 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 mysqlkonek = (Connection) DriverManager.getConnection(url,user,pass);
 
 
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"gagal koneksi");
 }
 
 }
 
 return mysqlkonek;
 
 }
 public static void main (String args[]){
 
 }  

   
}
