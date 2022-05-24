package practice;

import org.junit.Test;
import org.openqa.selenium.By;

public class Q9_Alert extends TestBase {









    @Test
    public void test1() {

        //    go to url :http://demo.automationtesting.in/Alerts.html

        driver.get("http://demo.automationtesting.in/Alerts.html");

        //    click  "Alert with OK" and click 'click the button to display an alert box:'
        //    accept Alert(I am an alert box!) and print alert on console

        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        //    cancel Alert  (Press a Button !)

        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().accept();

        //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        //    and then sendKeys 'TechProEducation' (Please enter your name)
        driver.switchTo().alert().sendKeys("TechProEducation");
        driver.switchTo().alert().accept();

        //    finally print on console this message "Hello TechproEducation How are you today"
        System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());


    }

}
