package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import practice.TestBase;

public class ScrollIntoWiew extends TestBase {

  /*  1- Yeni bir class olusturun : ScroolInto
2- hotelmycamp anasayfasina gidin
3- 2 farkli test method’u olusturarak actions clasi ve
    Js Executor kullanarak asagidaki oda turlerinden
    ust sira ortadaki odayi tiklayin
4- istediginiz oda inceleme sayfasi acildigini test
    edin
   */

    @Test
    public void test01(){

        driver.get("https://www.hotelmycamp.com/");

       WebElement rooms= driver.findElement(By.xpath("//a[@href='/rooms']"));
       Actions action=new Actions(driver);

       action.moveToElement(rooms).click().perform();

       WebElement room=driver.findElement(By.xpath("(//a[@href='/RoomDetail/206'])[1]"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);",room);
        js.executeScript("arguments[0].click();",room);

        Assert.assertTrue(driver.findElement(By.xpath("(//h2)[1]")).isDisplayed());
    }
}
