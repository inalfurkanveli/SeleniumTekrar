package day01_seleniumTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    /*
    jar dosyalarini yukleyerek selenium kullanilir hale getirdik
    ancak her bir class`in hangi browser ile calismasini istiyorsak
    o browser ile ilgili driver'i class'ta tanimlamamiz gerek

    browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak
    icin Java'daki System class'indan setProperty() kullanilir.

    Methoda 2 parametre eklenir

    1.parametre : herkes icin ayni olan
    "webdriver.chrome.driver"
    2.parametre : bu driver'in dosya yolu
    herkesin bilgisarayi ayni isletim sistemine sahip olmadigi icin
    windows isletim sisteminde dosya yolunun sonuna .exe yazilmalidir
    mac'te ise .exe yazilmasina gerek yoktur.
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //
        driver.get("https://www.amazon.com");

    }
}
