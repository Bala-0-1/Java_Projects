package databases;
import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;


public class TCL{

    private String jdbcUrl = "jdbc:mysql://localhost:3306/Hobby";
    private String username = "root";
    private String password = "mysql@123";
    public static void main(String[] args) {
        TCL f = new TCL();
        f.tclTesting();

    }

    public void tclTesting(){
        Statement statement;
        ResultSet rs;
        int res;
        try(Connection conn = DriverManager.getConnection(jdbcUrl,username,password)){
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            conn.commit();
            res = statement.executeUpdate("Insert into Persons values (1334,'maha','F','2006-06-24')");
            rs = statement.executeQuery("select * from HobbyList");
            while(rs.next()){
                
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}