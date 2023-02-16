package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {

        /*
        Selenium 4 ile yeni gelen bir ozellik
        Olur da bir web elementi locate edemez isek

       2 bilgi ile o elementi locate etmemiz mumkundur.
       1- etrafindaki bir web element( sagi,solu,ustu vb.)
       2- Locate edemedigimiz web elemente ait bir ozellik
       tag veya attribute gibi
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        WebElement londonElementi= driver.findElement(By.xpath("//*[@*='pid5_thumb']"));
        WebElement warsawElementi= driver.findElement(By.xpath("//*[@*='pid1_thumb']"));
        WebElement amsterdamElementi=driver.findElement(By.xpath("//*[*='pid9_thumb']"));
        WebElement bostonElementi= driver.findElement(By.xpath("//*[*='pid6_thumb']"));

        WebElement london1=driver.findElement(RelativeLocator.with(By.tagName("img")).below(warsawElementi));
        System.out.println(london1.getAttribute("id"));
        WebElement london2=driver.findElement(RelativeLocator.with(By.tagName("img")).below(amsterdamElementi));
        System.out.println(london2.getAttribute("id"));
        WebElement london3=driver.findElement(RelativeLocator.with(By.tagName("img")).below(bostonElementi));
        System.out.println(london3.getAttribute("id"));

    }
}
