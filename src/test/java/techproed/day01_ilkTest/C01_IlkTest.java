package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setProperty methodu ile class'ımıza driver'ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "Key" degerini girerek "value" ya ulasabilirim.
        WebDriver driver = new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk
        driver.get("https://www.techproeducation.com");//get() methodu String olarak girilen url'e gideriz
    }
}
