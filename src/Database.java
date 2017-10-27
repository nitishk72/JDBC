import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
* @author nitish
 */
public class Database {
    public static void main(String[] args) {
        
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbname","root","");  
            Statement stmt=con.createStatement(); 
            String sql = "INSERT INTO tablename " +"VALUES ('Java Programmer');";
            stmt.executeUpdate(sql);
            con.close();  
        }catch( ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }
        
    }
}
