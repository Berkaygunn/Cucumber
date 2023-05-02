package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {

    @Test
    public void NextPrev() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from language");
        rs.next(); // ilk satır 1. satır
        System.out.println(" 1. satır dil adı = " + rs.getString(2));  // English
                                                  // rs.getString(name)

        rs.next(); // 2. satır
        System.out.println(" 2. satır dil adı = " + rs.getString(2));   // Italian

        rs.next(); // 3. satır
        System.out.println(" 3. satır dil adı = " + rs.getString(2));   // Japanese

        rs.previous();  // 1 satır geri gider.
        System.out.println(" 1 geri satır dil adı = " + rs.getString(2));   // Italian

    }

    @Test
    public  void AbsoluteRelative() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from film");

        // rs.next() : sonraki satır
        // rs.previous : önceki satır
        // rs.absolute(10) : baştan itibaren 10.satıra gider.
        // rs.relative(10) : bulunduğu yerden 10.satıra gider.
        // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
        // rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri

        rs.absolute(10);  // 10.satıra git
        System.out.println("10.satır title = " + rs.getString("title"));

        rs.relative(5);  // 15. satıra gider.
        System.out.println("15.satır = " + rs.getString("title"));






    }


}
