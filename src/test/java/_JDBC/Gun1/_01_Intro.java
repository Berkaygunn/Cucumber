package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void Test1() throws SQLException {

        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        // connection açılıyor, fileInputStream
        Connection connection = DriverManager.getConnection(hostUrl, userName, password);  // bağlantıya click 1. madde


        // sql lerin yazılacağı sayfa
        Statement statement = connection.createStatement();   // sorguları çalıtırmak için sorgu gönderme ortamı

        // sorguyu yazdım ve çalıştırdım
        ResultSet rs = statement.executeQuery("select * from customer");  // sorg çalıştı sonuçları nerede ?

        // ilk satırı mı istiyorsun yoksa son satırı mı , yoksa hangisini istiyorsan ?
        rs.next();  // sıradaki ilk satıra gitti.

        String firstname=rs.getString("first_name");
        String lastname=rs.getString("last_name");
        System.out.println("1. satırdaki müşteri adı ve soyadı = " + firstname+" "+lastname);

        rs.next();  // 2. satıra

        firstname=rs.getString("first_name");
        lastname=rs.getString("last_name");
        System.out.println("2. satırdaki müşteri adı ve soyadı = " + firstname+" "+lastname);


        connection.close();
    }
}
