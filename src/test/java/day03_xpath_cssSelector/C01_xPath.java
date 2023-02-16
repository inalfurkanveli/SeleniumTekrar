package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("delete buton testi passed");
        }else {
            System.out.println("delete buton testi failed");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveButton= driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));

        if (addRemoveButton.isDisplayed()){
            System.out.println("Add/Remove Test passed");
        }else {
            System.out.println("Add/Remove Test failed");
        }
        Thread.sleep(3000);
        driver.close();



    }
}
