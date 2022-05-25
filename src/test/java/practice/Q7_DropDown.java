package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Q7_DropDown extends TestBase {




    //-->Task4 choose dropdown elements and printout dropdown elements' name  until choise 6

    @Test
    public void test1(){


        // go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        //-->Task1 Find Dropdown on Multi Selection


      WebElement a= driver.findElement(By.xpath("//input[@id='justAnInputBox']"));

        Select multia=new Select(a);

        //-->Task2 Find  all Dropdown Elements on page

     //   WebElement b= driver.findElement(By.xpath("//input[@id='justAnInputBox1']"));

      //  Select multib=new Select(b);

     //   WebElement c=driver.findElement(By.xpath("//input[@id='justAnotherInputBox']"));

    //    Select multic=new Select(c);

        //-->Task3 printout DropDown Elements' number

    //    System.out.println(multia.getOptions().size());
    //    System.out.println(multib.getOptions().size());
    //    System.out.println(multic.getOptions().size());


    }
}
