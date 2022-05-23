package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import practice.TestBase;

import java.util.List;
import java.util.Set;

public class WindowsHandle extends TestBase {

  /*

1."http://webdriveruniversity.com/" adresine gidin
2."Login Portal" a kadar asagi inin
3."Login Portal" a tiklayin
4.Diger window'a gecin
            5."username" ve "password" kutularina deger yazdirin
6."login" butonuna basin
7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
            8.Ok diyerek Popup'i kapatin
            9.Ilk sayfaya geri donun
10.Ilk sayfaya donuldugunu test edin

   */

    @Test
    public void test1(){

        driver.get("http://webdriveruniversity.com/");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        String ilk=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@href='Login-Portal/index.html']")).click();

        Set<String> handles= driver.getWindowHandles();
        String ikinci="";

        for (String each:handles) {if(!each.equals(ilk)){ikinci=each;}}

        driver.switchTo().window(ikinci);

        driver.findElement(By.xpath("//input")).sendKeys("asad");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("asad");
        driver.findElement(By.xpath("//button")).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().
        accept();
        driver.switchTo().window(ilk);

        Assert.assertTrue(driver.getWindowHandle().equals(ilk));


    }
}
