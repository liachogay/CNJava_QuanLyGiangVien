/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgv;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Phi Ngo
 */
public class DBConnect {
    private static DBConnect _Instance=null;
    
    public static DBConnect Instance(){
        if (_Instance==null){
            _Instance= new DBConnect();
        }
        return _Instance;
    }

    
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
                                                        databaseName+"?useUnicode=true&characterEncoding=utf-8",userName,passWord);
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
    
    public ResultSet GetData(String query){
        Connection conn = GetConnection();
        ResultSet ResultBack =null;
        Statement state = null;
        try{
            state = conn.createStatement();
            ResultBack = state.executeQuery(query);
        } catch(Exception ex){
            System.out.println(ex);
        }
        return ResultBack;
    }
    
    
    public ResultSet GetDataTableId(String query,String id){
        Connection conn = GetConnection();
        ResultSet ResultBack =null;
        Statement state = null;
        try{
            state = conn.createStatement();
            ResultBack = state.executeQuery(query+id);
        } catch(Exception ex){
            System.out.println(ex);
        }
        return ResultBack;
    }
    
    public void InsertDataGV(String MaGV,String MaKhoa,String MaLop,String HoTen,String HocVi,int Luong,
                                String QueQuan,String DiaChi,int GioiTinh){
       Connection conn = GetConnection();
       String query = "INSERT INTO giangvien(MaGV, MaKhoa, MaLop, HoTen, HocVi, Luong, QueQuan, DiaChi, GioiTinh)"
                       +" VALUES (?, ?, ?, ?, ?, ?, ?, ? , ?)";
       try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaGV);
            preparedStatement.setString(2, MaKhoa);
            preparedStatement.setString(3, MaLop);
            preparedStatement.setString(4, HoTen);
            preparedStatement.setString(5, HocVi);
            preparedStatement.setInt(6, Luong);
            preparedStatement.setString(7, QueQuan);
            preparedStatement.setString(8, DiaChi);
            preparedStatement.setInt(9, GioiTinh);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateDataGV(String MaGV,String MaKhoa,String MaLop,String HoTen,String HocVi,int Luong,
                                String QueQuan,String DiaChi,int GioiTinh){
        Connection conn = GetConnection();
        String query = "UPDATE giangvien SET "
                + "MaGV=?,MaKhoa=?,MaLop=?,HoTen=?,HocVi=?,Luong=?,QueQuan=?,DiaChi=?,GioiTinh=?"
                + " WHERE MAGV =?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaGV);
            preparedStatement.setString(2, MaKhoa);
            preparedStatement.setString(3, MaLop);
            preparedStatement.setString(4, HoTen);
            preparedStatement.setString(5, HocVi);
            preparedStatement.setInt(6, Luong);
            preparedStatement.setString(7, QueQuan);
            preparedStatement.setString(8, DiaChi);
            preparedStatement.setInt(9, GioiTinh);
            preparedStatement.setString(10,MaGV);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteDataGV(String id){
        Connection conn = GetConnection();
        String query = "DELETE FROM giangvien WHERE magv = '"+id+"' ";
        Statement state = null;
        try {
            state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InsertDataKhoa(String MaKhoa,String TenKhoa,Date NgayThanhLap){
        Connection conn = GetConnection();
        String query = "INSERT INTO khoa (MaKhoa, TenKhoa, NgayThanhLap) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaKhoa);
            preparedStatement.setString(2, TenKhoa);
            preparedStatement.setDate(3, NgayThanhLap); 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateDataKhoa(String MaKhoa,String TenKhoa,Date NgayThanhLap){
        Connection conn = GetConnection();
        String query = "UPDATE khoa SET MaKhoa=?,TenKhoa=?,NgayThanhLap=? WHERE MaKhoa = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaKhoa);
            preparedStatement.setString(2, TenKhoa);
            preparedStatement.setDate(3, NgayThanhLap);
            preparedStatement.setString(4, MaKhoa);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteDataKhoa(String id){
        Connection conn = GetConnection();
        String query = "DELETE FROM khoa WHERE makhoa = '"+id+"' ";
        Statement state = null;
        try {
            state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void InsertDataLop(String MaLop,String MaKhoa,String TenLop,int SiSo){
        Connection conn = GetConnection();
        String query = "INSERT INTO lop (MaLop, MaKhoa, TenLop,SiSo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaLop);
            preparedStatement.setString(2, MaKhoa);
            preparedStatement.setString(3, TenLop); 
            preparedStatement.setInt(4, SiSo); 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void UpdateDataLop(String MaLop,String MaKhoa,String TenLop,int SiSo){
        Connection conn = GetConnection();
        String query = "UPDATE lop SET MaLop=?,MaKhoa=?,TenLop=?,SiSo=? WHERE MaLop = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, MaLop);
            preparedStatement.setString(2, MaKhoa);
            preparedStatement.setString(3, TenLop); 
            preparedStatement.setInt(4, SiSo); 
            preparedStatement.setString(5, MaLop); 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void DeleteDataLop(String id){
        Connection conn = GetConnection();
        String query = "DELETE FROM lop WHERE malop = '"+id+"' ";
        Statement state = null;
        try {
            state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InsertDataLich(String Phong,int TietBD,int TietKT,Date Ngay,String Thu,String MaGV){
        Connection conn = GetConnection();
        String query = "INSERT INTO lich (Phong, TietBatDau, TietKetThuc, Ngay, Thu, MaGv) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, Phong);
            preparedStatement.setInt(2, TietBD);
            preparedStatement.setInt(3, TietKT); 
            preparedStatement.setDate(4, Ngay);  
            preparedStatement.setString(5, Thu);  
            preparedStatement.setString(6, MaGV); 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void UpdateDataLich(String Phong,int TietBD,int TietKT,Date Ngay,String Thu,String MaGV){
        Connection conn = GetConnection();
        String query = "UPDATE lich SET Phong=?,TietBatDau=?,TietKetThuc=?,Ngay=?,Thu=?,MaGV=? WHERE Phong = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, Phong);
            preparedStatement.setInt(2, TietBD);
            preparedStatement.setInt(3, TietKT); 
            preparedStatement.setDate(4, Ngay);  
            preparedStatement.setString(5, Thu);  
            preparedStatement.setString(6, MaGV); 
            preparedStatement.setString(7, Phong); 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void DeleteDataLich(String id){
        Connection conn = GetConnection();
        String query = "DELETE FROM lich WHERE phong = '"+id+"' ";
        Statement state = null;
        try {
            state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
