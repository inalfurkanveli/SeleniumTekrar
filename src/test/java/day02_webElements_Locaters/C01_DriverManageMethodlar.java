package day02_webElements_Locaters;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverManageMethodlar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        System.out.println("ilk size :"+driver.manage().window().getSize());
        System.out.println("ilk position: "+driver.manage().window().getPosition());
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(850,1028));

        driver.manage().window().setPosition(new Point(15,25));
    }
}
