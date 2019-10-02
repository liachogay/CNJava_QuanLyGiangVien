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
    public final static DBConnect Instance=new DBConnect();

    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        
    }
    
    public Connection GetConnection(){
        String hostName ="localhost";
        String port = "3306";
        String databaseName ="qlgv";
        String userName ="root";
        String passWord = "";
        
        return GetConnection(hostName,port,databaseName,userName,passWord);
    }
    
    private Connection GetConnection(String hostName,String port,String databaseName,
                                        String userName,String passWord){
        Connection ConnectBack = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            ConnectBack = DriverManager.getConnection("jdbc:mysql://"+hostName+":"+port+"/"+
                                                        databaseName,userName,passWord);
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        return ConnectBack;
    }
    
    public Statement GetStatement(Connection conn){
        Statement StatementBack = null;
        try{
            StatementBack = conn.createStatement();
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
        return StatementBack;
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
    
    public ResultSet GetData(String query){
        Connection conn = GetConnection();
        ResultSet ResultBack =null;
        Statement state = null;
        try{
            state = conn.createStatement();
            ResultBack = state.executeQuery(query);
            conn.close();
        } catch(Exception ex){
            System.out.println(ex);
        }
        return ResultBack;
    }
    
}
