package CNJava_QuanLyGiangVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
   private static final DBHelper _Instance = new DBHelper();
    
    //private constructor to avoid client applications to use constructor
    private DBHelper(){
        
    }

    public static DBHelper Instance(){
        return _Instance;
    }
    
    public Connection Connect() throws SQLException,ClassNotFoundException {
        String hostName = "DESKTOP-1LS8MPD\\SQLEXPRESS";
        String sqlInstanceName = "";
        String database = "qlgv";
        String userName = "DESKTOP-1LS8MPD\\ASUS";
        String passWord ="";
        return Connect(hostName,sqlInstanceName,database,userName,passWord);
    }
    
    private Connection Connect(String hostName,String sqlInstanceName,
                            String database,String userName,String passWord) throws SQLException,ClassNotFoundException{
        
        //Tìm driver cho DB SQLServer
        Class.forName("net.sourceforge.jtds.jdbc.Drive");
        
        //Ví d? : jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
        String connectionURL = "jdbc:jtds:sqlserver://"+hostName+":1433/"+
                database+"instance="+sqlInstanceName;
        
        Connection connect = DriverManager.getConnection(connectionURL,userName,passWord);
        
        return connect;
    }
    
    
}