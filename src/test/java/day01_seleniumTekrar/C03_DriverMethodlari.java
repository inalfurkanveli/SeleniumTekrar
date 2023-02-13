package day01_seleniumTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        // amazon ana sayfasina gidin
        // gittiginiz sayfanin url ve title'ini yazdirin
        // gittiginiz sayfanin dogru olup olmadigini sorgulayin


        driver.get("https://www.amazon.com");
        System.out.println("Amazon Title: "+driver.getTitle());
        System.out.println("URL :"+driver.getCurrentUrl());

        String exceptedIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(exceptedIcerik)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

    }
}
