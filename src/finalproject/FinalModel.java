package finalproject;
import java.sql.*;

public class FinalModel {
    Connection con;
    public FinalModel()
    {
        String url = "jdbc:mysql://localhost:3306/finalproject";
        String login = "root";
        String password = "";
        
        System.out.println("Congratulations!!");
        try
        {
            con = DriverManager.getConnection(url, login, password);
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
