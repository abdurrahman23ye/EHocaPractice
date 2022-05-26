package tasks;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import practice.TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetScreeShot179 extends TestBase {

    /*Yeni bir class olusturun : amazonNutellaSearch
1- amazon anasayfaya gidin
2- amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
3- Nutella icin arama yapin
4- sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin

     */

    @Test
    public void getScreenShot() throws IOException {

       driver.get("https://www.amazon.com");

        TakesScreenshot ts= (TakesScreenshot) driver;

        WebElement amazon=driver.findElement(By.xpath("//html"));

        Assert.assertTrue(amazon.isEnabled());



        File resim= new File("target/amazon/ab.jpeg");
           File gecici=     ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(gecici,resim);

        WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        search.sendKeys("nutella"+ Keys.ENTER);



        WebElement sonuc=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));

        File resim1= new File("target/amazon/abc.jpeg");
        File gecici1=     sonuc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(gecici1,resim1);



    }
}
