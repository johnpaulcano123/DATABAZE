/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

 import  java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConnector {

private Connection connect;

    public dbConnector(){
        
            try {
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root","");
            } catch (SQLException ex) {
                System.out.println("Can't connect to Database;" +ex.getMessage());
            }
                    
        }
    
    public ResultSet getData(String sql) throws SQLException{
        
      
        Statement stmt  = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst; 
      
        
    }
    }
      

  
   

