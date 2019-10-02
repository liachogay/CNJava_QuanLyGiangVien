/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;

import java.sql.*;


/**
 *
 * @author Phi Ngo
 */
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlgv","root","");
            st = con.createStatement();
            
            
        }catch (Exception ex){
            System.out.println("Error: " + ex);
        }
        
    }
    public void getData(){
        try {
            String query = "select * from login";
            rs = st.executeQuery(query);
            System.out.println("Record from Database");
            while(rs.next()){
                String name = rs.getString("username");
                String pass = rs.getString("password");
                System.out.println("UName: " + name+ "Pass: " + pass);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
