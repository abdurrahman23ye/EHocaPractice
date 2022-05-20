package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Q3 extends TestBase {

    /*
     ...Exercise3...
    // http://the-internet.herokuapp.com/add_remove_elements/
    // click on the "Add Element" button 100 times
    // write a function that takes a number, and clicks the "Delete" button
    // given number of times, and then validates that given number of
    // buttons was deleted

    1.method : createButtons(100)
    2.deleteButtonsAndValidate()
 */

    @Test
    public void test1(){

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        int sayac=0;
       while (sayac<100) {
           driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
           sayac++;
       }

           Integer kacDeleteKaldirilsin=20;

           Actions action=new Actions(driver);

          WebElement del= driver.findElement(By.xpath("(//button[@class='added-manually'])[1]"));
          sayac=0;


          while (sayac<kacDeleteKaldirilsin){

              del= driver.findElement(By.xpath("(//button[@class='added-manually'])[1]"));

           action.moveToElement(del).click().perform();
           sayac++;

       }

    }




}
