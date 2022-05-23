package tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import practice.TestBase;

import java.time.Duration;

public class ExplicitWait156 extends TestBase {
    /*
    Explicit Wait Class Work

1. Bir class olusturun : EnableTest

2. Bir metod olusturun : isEnabled()

3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
4. Textbox’in etkin olmadigini(enabled) dogrulayın

5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin

6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
7. Textbox’in etkin oldugunu(enabled) dogrulayın.
     */

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        Assert.assertFalse(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
      WebElement enable= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
              enable.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        String mes=driver.findElement(By.xpath("//p[@id='message']")).getText();
        System.out.println(mes);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        Thread.sleep(7000);
        Assert.assertTrue(mes.equals("It's enabled!"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
    }
}
