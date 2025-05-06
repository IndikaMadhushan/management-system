package codes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnect {
    private static final String uName = "root";
    private static final String pwd = "";
    private static final String url = "jdbc:mysql://localhost:3306/project123";
    public static Connection conn = null;
    
    public static Connection connect() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, uName, pwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return conn;   
    }
    
}
