package tasks;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exel {

  /*  7. Dosya yolunu bir String degiskene atayalim
8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
10. WorkbookFactory.create(fileInputStream)
            11. Worksheet objesi olusturun workbook.getSheetAt(index)
12. Row objesi olusturun sheet.getRow(index)
13. Cell objesi olusturun row.getCell(index)

   */

    @Test
    public void readExel() throws IOException {

        String dosyaYolu="src/resources/ulkeler.xlsx";

        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row= sheet.getRow(3);
        Cell cell= row.getCell(3);

        System.out.println(cell);

    }


}
