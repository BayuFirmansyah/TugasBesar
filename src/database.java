import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
        
public class database {
    private static Connection conn;
    public static void main(String[] args) throws ClassNotFoundException{
        Connection con = null;
        
        String url ="jdbc:mysql://localhost:3306/tbjava";
        String user="root";
        String pass="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi berhasil");
        } catch (SQLException e){
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
    }
    
}
