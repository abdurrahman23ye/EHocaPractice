package practice;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Q10_Iframe extends TestBase {
      /*
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
    // web sitesini maximize yapin
    // ikinci emojiye tıklayın
    // tüm ikinci emoji öğelerini tıklayın
    // parent iframe e geri donun
    // formu doldurun,(Formu istediğiniz metinlerle doldurun)
    //  apply button a basin
 */

    @Test
    public void test1(){

        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame("emoojis");
        driver.findElement(By.xpath("(//img[@draggable='false'])[10]")).click();
        driver.findElement(By.xpath("(//img[@draggable='false'])[40]")).click();
        driver.findElement(By.xpath("(//img[@draggable='false'])[70]")).click();
        driver.switchTo().parentFrame();

        Faker fake=new Faker();
        Actions action=new Actions(driver);

      driver.findElement(By.xpath("//input[@class='mdl-textfield__input'][1]")).sendKeys(fake.name().firstName());
     action.sendKeys(Keys.TAB).perform();
      action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(fake.name().firstName());
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys(Keys.TAB).perform();

        driver.findElement(By.xpath("//button")).click();

    }
}
