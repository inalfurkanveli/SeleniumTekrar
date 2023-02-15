package day02_webElements_Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlar {
    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Homework)
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve
        driver.get("https://www.facebook.com");
        // sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        String exceptedTitle= "facebook";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(exceptedTitle)){
            System.out.println("Title Test Passed");
        }else {
            System.out.println("Title Test Failed\n"+ "Actual Title : "+actualTitle);
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String exceptedUrlIcerik="facebook";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(exceptedUrlIcerik)){
            System.out.println("Url Test Passed");
        }else {
            System.out.println("Url Test Failed.\n"+ "Actual URL :"+ actualUrl);
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String walmartExceptedIcerik="Walmart.com";
        String walmartActualTitle=driver.getTitle();

        if (walmartActualTitle.contains(walmartExceptedIcerik)){
            System.out.println("Walmart Title Test PASSED");
        }else {
            System.out.println("Walmart Title Test FAILED");
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().fullscreen();
        //9.Browser’i kapatin
        driver.close();
    }

}
