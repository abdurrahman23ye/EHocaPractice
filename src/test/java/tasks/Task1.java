package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*  Notes: It may also be necessary to write code to accept the accept cookies warning.
              1. Go to 'https://www.amazon.com.tr/'
              2. Search iPhone13 512
              3. Check that the results are listed
  4. Click iPhone13 at the top of the list
  5. Log the following values for each size
  .Size information .Price .Color .Stock status

     */
     WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.amazon.com.tr/");


        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("iPhone13 512" + Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
        result.click();


        WebElement size0 = driver.findElement(By.xpath("//div[@id='kfs_family_0']"));
        WebElement size1 = driver.findElement(By.xpath("//div[@id='kfs_family_1']"));
        WebElement size2 = driver.findElement(By.xpath("//div[@id='kfs_family_2']"));
        WebElement size3 = driver.findElement(By.xpath("//div[@id='kfs_family_3']"));
        WebElement size4 = driver.findElement(By.xpath("//div[@id='kfs_family_4']"));
        WebElement size5 = driver.findElement(By.xpath("//div[@id='kfs_family_5']"));
        WebElement size6 = driver.findElement(By.xpath("//div[@id='kfs_family_6']"));

        List<WebElement> iphones = new ArrayList<>();
        iphones.add(size0);
        iphones.add(size1);
        iphones.add(size2);
        iphones.add(size3);
        iphones.add(size4);
        iphones.add(size5);
        iphones.add(size6);





        JavascriptExecutor xy = (JavascriptExecutor) driver;



        for (int i = 0; i < iphones.size(); i++) {
            WebElement tel=iphones.get(i);


                try {
                    tel.click();

                } catch (org.openqa.selenium.StaleElementReferenceException ex) {

                    tel.click();
                    }



         WebElement   price= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[6]"));
            System.out.println(price.getText());
           WebElement stock=driver.findElement(By.xpath("//span[contains(text(),'Stokta')]"));
            System.out.println(stock.getText());
         //   xy.executeScript("window.scrollBy(0,100)");
   /*     WebElement    color=driver.findElement(By.
                    xpath("(//span[@class='selection'])[2]"));

            System.out.println(color.getText());

    */
           // xy.executeScript("window.scrollBy(0,-100)");

        }

                }
            }

