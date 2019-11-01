/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author virgin
 */
public class DBConnect {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
            st = con.createStatement();
            
            
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
                    
    }
    
}
