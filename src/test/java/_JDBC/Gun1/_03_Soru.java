package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Soru extends JDBCParent {

    // city tablosundaki tüm satırlardaki şehir isimleri next ile yazdırınız

    @Test
    public void Test() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from city");

        int rowCount = 0;
        while (rs.next()) {
            System.out.println(rs.getString("city"));
            rowCount++;
        }

        System.out.println("rowCount = " + rowCount);

    }

    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from city");

        rs.last();

        int a = Integer.parseInt(rs.getString(1));

        for (int i = 1; i <= a; i++) {
            rs.absolute(i);
            System.out.println(rs.getString("city"));
        }

    }
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    @Test
    public void soru2() throws SQLException {


    }
}