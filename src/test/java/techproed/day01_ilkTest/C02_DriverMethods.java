package techproed.day01_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() sayfa başlığını verir.
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : " +driver.getCurrentUrl());

        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHandle);


        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir
        System.out.println("Techproed Actual Url : " +driver.getCurrentUrl());//getCurrentUrl() Gidilen sayfanın Url'ini verir.

        //getPageSource() Açılan sayfanın kaynak kodlarını verir.
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık.

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());

    }
}
