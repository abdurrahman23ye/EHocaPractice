package tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.TestBase;

import java.time.Duration;

public class Actions157 extends TestBase {

    @Test
    public void Test1() throws InterruptedException {

        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin

        driver.get("http://webdriveruniversity.com/Actions");

        //2. "Hover over Me First" kutusunun ustune gelin
        //  3. "Link 1" e tiklayin

        Actions action=new Actions(driver);
      WebElement homf= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
      action.moveToElement(homf).perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement l1=   driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(l1));
        l1.click();

     //   4. Popup mesajini yazdirin

        System.out.println(driver.switchTo().alert().getText());


       // 5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        // 6. "Click and hold" kutusuna basili tutun.

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,100)");

        WebElement cah=driver.findElement(By.xpath("//p[text()='Click and Hold!']"));

        action.clickAndHold(cah).perform();

        //7. "Click and hold" kutusunda cikan yaziyi yazdirin

        System.out.println(driver.findElement(By.xpath("//div[@id='click-box']")).getText());


        // 8. "Double click me" butonunu cift tiklayin

        js.executeScript("window.scrollBy(0,-100)");

        WebElement dc=driver.findElement(By.xpath("//h2"));

        action.doubleClick(dc).perform();


    }

}
