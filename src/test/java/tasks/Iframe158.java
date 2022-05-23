package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import practice.TestBase;

public class Iframe158 extends TestBase {
    /*
    Iframe Home Work

1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
2. “Our Products” butonuna basin
3. “Cameras product”i tiklayin
4. Popup mesajini yazdirin
5. “close” butonuna basin
6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
     */

    @Test
    public void test1(){

        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        driver.switchTo().frame("frame");
        driver.findElement(By.xpath("//a[@href='products.html']")).click();
        driver.findElement(By.xpath("//p[text()='Cameras']")).click();
       driver.findElement(By.xpath("(//button[@data-dismiss='modal' and @class='btn btn-default'])[2]")).click();
        driver.switchTo().parentFrame();
       driver.findElement(By.linkText("WebdriverUniversity.com (IFrame)")).click();
        Assert.assertEquals("http://webdriveruniversity.com/index.html",driver.getCurrentUrl());
    }

}
