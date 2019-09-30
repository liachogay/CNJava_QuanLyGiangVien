package CNJava_QuanLyGiangVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
   private static final DBHelper _Instance = new DBHelper();
    
    //private constructor to avoid client applications to use constructor
    private DBHelper(){
        
    }

    public static DBHelper getInstance(){
        return _Instance;
    }
    
    public void Connect() throws SQLException,ClassNotFoundException {
        String hostName = "";
        String sqlInstanceName = "";
        String database = "";
        String userName = "";
        String passWord ="";
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