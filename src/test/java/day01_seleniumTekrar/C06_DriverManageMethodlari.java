package day01_seleniumTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().getSize() bize pencerenin pixel olarak
        // boyutunu verir
        System.out.println("maximize size :"+driver.manage().window().getSize());
        // driver.manage().window().getPosition bize pencerinin ekrandaki
        // pozisyonunu verir.
        System.out.println(" "+driver.manage().window().getPosition());

    }
}
