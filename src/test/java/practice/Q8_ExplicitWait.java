package practice;

import org.junit.Test;
import org.openqa.selenium.By;

public class Q8_ExplicitWait extends TestBase {
    /*
    //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //maximize the window
    //click on action dialog button
    //if need use explicitly wait
    //click on the ok button
    //accept the alert message
 */

    @Test
    public void test1(){

        driver.get("https://www.jqueryscript.net/demo/bootstrap-alert-box/");
        driver.findElement(By.xpath("//button[@id='action']")).click();

        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.switchTo().alert().accept();
    }
}
