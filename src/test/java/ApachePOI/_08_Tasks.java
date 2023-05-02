package ApachePOI;

/**  Soru 1:
 *  yeni excel (altalta.xls)
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**  Soru 2:
 * yeni excel (yanyana.xls)
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */
public class _08_Tasks {
    public static void main(String[] args) {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");








    }
}
