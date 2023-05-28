package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon sayfa baslığı:" + driver.getTitle());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : " + amazonWindowHandle );
        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual sayfa baslığı:" + driver.getTitle());//gettitle methodu sayfa baslığını verir
        //getcurrently( ) gidilen sayfanın url ini verir.
        System.out.println("Techproed Actual Url:" +driver.getCurrentUrl());
        //getPageSource() açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource()); bilerek yoruma aldık her çalıştırdığımzda butun kaynakları vermesin diye.
        //getWindowHandle() gidilen sayfanın handle değerini (hashkod)nverir. bu handle değerini sayfalar arası geçişler için kullanırız
        System.out.println("Techproed Window Handle Değeri : " + driver.getWindowHandle());












    }
}
