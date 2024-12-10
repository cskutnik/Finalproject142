package finalproject;
import java.sql.*;

public class FinalModel {
    Connection con;
    PreparedStatement myquery;
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
    public static void InsertMethod(String l, String f, String a1, String a2, String c, String s)
    {
        String sqlCode = "insert into employees" +
                "(lastname, firstname, phoneType, phonenumber, address1, address2, city, state) values ()";
    }
}
