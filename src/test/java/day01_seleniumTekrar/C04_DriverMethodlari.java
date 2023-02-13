package day01_seleniumTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        // gidilen sayfayi pencere boyutunu tam ekran yapar
        driver.manage().window().maximize();
        // belirtilen url yi chrome browser'da acar
        driver.get("https://www.amazon.com");

        System.out.println(driver.getWindowHandle());
        // CDwindow-AD742E0966AEDCA2009217BC34D077C6

        // getWindowHandle selenium tarafindan her driver sayfası icin
        // üretilen uniqe handle degerini getirir.
        // getWindowHandles ise test sırasında birden fazla sayfa acilmissa
        // bir set olarak tüm sayfaların window handle degerlerini bize döndürür.


        System.out.println(driver.getPageSource());
        // gittigimiz sayfanin tum kodlarini bize getirir.
        //  sayfa kodları"2 hours weekly meeting with the team" iceriyor mu test edin

        String exceptedIcerik="2 hours weekly meeting with the team";
        String actualPageCodes= driver.getPageSource();

        if (actualPageCodes.contains(exceptedIcerik)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        driver.close();
        // close ve quit ikiside sayfa kapatmak icin kullanilir
        // close sadece 1 sayfayi kapatirken
        // quit ise test sirasinda acilan tum sayfalari kapatir.


    }
}
