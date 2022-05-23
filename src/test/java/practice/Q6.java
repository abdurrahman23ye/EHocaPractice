package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Q6 extends TestBase {
    /*
      ...Exercise6...
   // 1. Amazon.com'a gidelim.
   // 2. DropDown üzerinde Books secelim.(All yazan yerde)
   //    kategorilerin hepsini konsola yazdiralim
   // 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
   // 4. Sonuc sayisini ekrana yazdiralim.
   // 5. Sonucların Les Miserables i icerdigini assert edelim
   */

    @Test
    public void test1(){

     driver.get("https://www.amazon.com");

     WebElement slc=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

     Select select=new Select(slc);

      List<WebElement> options=select.getOptions();

        for (WebElement each: options) {System.out.println(each.getText());}

        select.selectByVisibleText("Books");

     WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

     searchBox.sendKeys("Les Miserables");
     searchBox.submit();

     WebElement result=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));

        String rslt=result.getText();

        System.out.println(rslt.substring(12, 18));


    }

}