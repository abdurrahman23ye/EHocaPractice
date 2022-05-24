package tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import practice.TestBase;

import java.util.List;

public class WebTables extends TestBase {
     /*
    ● Bir class oluşturun : C02_WebTables
● login( ) metodun oluşturun ve oturum açın.
● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
            ○ Username : manager
            ○ Password : Manager1!
● table( ) metodu oluşturun
            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
● printRows( ) metodu oluşturun //tr
            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
     */


    @Test
    public void login() {
          /*
    ● Bir class oluşturun : C02_WebTables
● login( ) metodun oluşturun ve oturum açın.
● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
            ○ Username : manager
            ○ Password : Manager1!

            */

        driver.get("https://www.hotelmycamp.com");

        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.xpath("(//input[@data-val='true'])[1]")).sendKeys("manager");
        driver.findElement(By.xpath("(//input[@data-val='true'])[2]")).sendKeys("manager1!");
        WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
        login.click();

     /*   ● table( ) metodu oluşturun
            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

      */


        List<WebElement> sutunSayisi=driver.findElements(By.xpath("//thead//tr[1]//th"));

        System.out.println(sutunSayisi.size());

        for (WebElement each: sutunSayisi
             ) {System.out.println(each.getText());}

       /* ● printRows( ) metodu oluşturun //tr
            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
                */
        System.out.println(driver.findElements(By.xpath("//tbody//tr")).size());

        System.out.println(driver.findElement(By.xpath("//tbody//tr")).getText());

        List<WebElement> list=driver.findElements(By.xpath("//tbody//tr[4]//td"));

        for (WebElement each:list
             ) {
            System.out.println(each.getText());

        }

    }
}
