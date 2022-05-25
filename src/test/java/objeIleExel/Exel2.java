package objeIleExel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exel2 {
    static   List<Exel> exelVerileri=new ArrayList<>();


    @Test
    public void exelVeriObjeyeEkleme() throws IOException {


        String dosyaYolu="src/resources/ulkeler.xlsx";

        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sh= workbook.getSheet("Sayfa1");


        String ulke_Ingilizc="";
        String ulke_Turkc="";
        String baskent_Turkc="";
        String baskent_Ingilizc="";


            for (int j = 0; j <190 ; j++) {
                Exel obj=new Exel(ulke_Ingilizc,ulke_Turkc,baskent_Turkc,baskent_Ingilizc);

                obj.setBaskent_Turkce(String.valueOf(workbook.getSheet("Sayfa1").getRow(j).getCell(3)));
                obj.setUlke_Turkce(String.valueOf(workbook.getSheet("Sayfa1").getRow(j).getCell(2)));
                obj.setBaskent_Ingilizce(String.valueOf(workbook.getSheet("Sayfa1").getRow(j).getCell(1)));
                obj.setUlke_Ingilizce(String.valueOf(workbook.getSheet("Sayfa1").getRow(j).getCell(0)));


                exelVerileri.add(obj);

            }
        for (Exel each:exelVerileri) {System.out.println(each.getBaskent_Turkce());}


    }


    }



