package day02_webElements_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_AutomationExercise {
    public static void main(String[] args) throws InterruptedException {
     //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementleri = driver.findElements(By.className("panel-heading"));

        //4- Category bolumunde 3 element oldugunu test edin
        int exceptedCategorySize= 3;
        int actualCategorySize=categoryElementleri.size();
        if (actualCategorySize==exceptedCategorySize){
            System.out.println("Category Size Test Passed");
        }else {
            System.out.println("Category Size Test Failed");
        }

        //5- Category isimlerini yazdirin
        int kategoriSize=1;
        for (WebElement eachElement:categoryElementleri
             ) {
            System.out.println(kategoriSize+" --- "+ eachElement.getText());
            kategoriSize++;
        }
        //6- Sayfayi kapatin

        Thread.sleep(5000);
        driver.close();
    }
}
