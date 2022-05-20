package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    /*
    ...Exercise1...
    BeforeClass ile driver ı olusturun ve class icinde static yapin
    Maximize edin, 15 sn bekletin
    http://www.google.com adresine gidin
    arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatın

 */
    static WebDriver driver;
    WebElement seachBox;
    WebElement result;
    String count;


    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Before
    public void test1(){
        driver.get("http://www.google.com");
       seachBox= driver.findElement(By.xpath("//input[@name='q']"));
    }

    @Test
    public void tes1(){

        seachBox.sendKeys("Green Mile"+Keys.ENTER);

        result=driver.findElement(By.xpath("//div[@id='result-stats']"));

        count=result.getText();

        System.out.println("count = " + count.substring(0,count.length()-14));


    }

    @Test
    public void test2(){

        seachBox.sendKeys("Premonition"+Keys.ENTER);

        result=driver.findElement(By.xpath("//div[@id='result-stats']"));

        count=result.getText();

        System.out.println("count = " + count.substring(0,count.length()-14));


    }

    @Test
    public void test3(){

        seachBox.sendKeys("The Curious Case of Benjamin Button"+Keys.ENTER);

        result=driver.findElement(By.xpath("//div[@id='result-stats']"));

        count=result.getText();

        System.out.println("count = " + count.substring(0,count.length()-14));


    }

    @AfterClass
    public static void TearDown(){

        driver.quit();
    }



}
