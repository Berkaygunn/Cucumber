package _JDBC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {

     public  static Connection connection;
    public  static Statement statement;

    @BeforeClass
    public void DBConnectionOpen(){
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(hostUrl, userName, password);
            statement = connection.createStatement();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    @AfterClass
    public void DBConnectionClose(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
