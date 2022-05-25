package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import practice.TestBase;

public class WebTables170 extends TestBase {

   /* WebTables class’ini kullanin.
            1. Bir metod oluşturun : printData(int row, int column);

a. Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu
    hücredeki(cell) veriyi yazdırmalıdır.

            2. Baska bir Test metodu oluşturun: printDataTest( );

    a. Ve bu metodu printData( ) methodunu cagirmak icin kullanin.
    b. Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır
    c. yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

    */
    int row=3;
    int column=3;
    @Test
    public void printData( ){

        driver.get("https://www.hotelmycamp.com");

        driver.findElement(By.xpath("//a[@href='/Account/Logon']")).click();
        driver.findElement(By.xpath("(//input[@data-val='true'])[1]")).sendKeys("manager");
        driver.findElement(By.xpath("(//input[@data-val='true'])[2]")).sendKeys("manager1!");
        WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
        login.click();

        String actuelResult= printData(3,5);

        Assert.assertEquals("12.12.2020",actuelResult);


    }




  public String printData(int row, int column){

    return driver.findElement(By.xpath("//tbody//tr["+row+"]//td["+column+"]")).getText();







    }


}
