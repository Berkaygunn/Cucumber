package Utulities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.*;
import java.util.ArrayList;

public class DBUtulity {

    public  static Connection connection;
    public  static Statement statement;

    public static ArrayList<ArrayList<String>> getListData(String sql) throws SQLException {
        DBConnectionOpen();
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        DBConnectionClose();
        return tablo;
    }


    public static void DBConnectionOpen(){
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


    public static void DBConnectionClose(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
