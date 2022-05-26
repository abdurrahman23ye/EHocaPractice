package tasks;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExel175 {

  /*  Yeni bir test method olusturalim readExcel2( )
- 1.satirdaki 2.hucreye gidelim ve yazdiralim
- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
- Satir sayisini bulalim
- Fiziki olarak kullanilan satir sayisini bulun
- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim

   */
    @Test
    public void readExel2() throws IOException {

        FileInputStream fis=new FileInputStream("src/resources/ulkeler.xlsx");

        Workbook workbook= WorkbookFactory.create(fis);
        System.out.println(workbook.getSheet("Sayfa1").getRow(0).getCell(1));
        String rs=workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();
        System.out.println(rs);
        System.out.println(workbook.getSheet("Sayfa1").getRow(1).getCell(3));

      Assert.assertTrue(workbook.getSheet("Sayfa1").getRow(1).getCell(3).toString().equals("Kabil"));

        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum());

        System.out.println(workbook.getSheet("Sayfa1").getPhysicalNumberOfRows());

        Map<String,String> ulkeBaskent=new HashMap<>();

        String key="";
        String value="";

        for (int i = 0; i <191 ; i++) {

            key= String.valueOf(workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            value= String.valueOf(workbook.getSheet("Sayfa1").getRow(i).getCell(1));

            ulkeBaskent.put(key,value);


        }

        System.out.println(ulkeBaskent);

        System.out.println(ulkeBaskent.size());




    }

}
