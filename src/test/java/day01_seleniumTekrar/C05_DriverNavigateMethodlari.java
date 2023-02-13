package day01_seleniumTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //full ekran yapar
        driver.manage().window().maximize();
        // amazon'a gidelim
        driver.get("https://www.amazon.com");
        // amazondan wisequarter'a gidelim
        driver.get("https://www.wisequarter.com");
        // wisequarter'dan amazona don
        driver.navigate().back();
        // tekrardan wisequarter'a don
        driver.navigate().forward();
        // en son sayfadan youtube'ye gidin
        driver.navigate().to("https://www.youtube.com");
        // sayfayi yenileyip kapatin
        driver.navigate().refresh();

        driver.close();


    }
}
