/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNJava_QuanLyGiangVien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       
        Connection conn =  DBHelper.Instance().Connect();
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_READ_ONLY);
        String sql = "select * from dangnhap";
        
        ResultSet rs = statement.executeQuery(sql);
        String a ="",b="";
        System.out.println(rs.getRow());
        while(rs.next()){
            a= rs.getString(1);
            b= rs.getString(2);
            System.out.println(a+ " " + b );
        }
    }
    
}
