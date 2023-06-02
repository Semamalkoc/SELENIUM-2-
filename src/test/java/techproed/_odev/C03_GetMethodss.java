package techproed._odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethodss {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com/");
        //Sayfa başlığını(title) yazdırın
        System.out.println("Sayfa Basligi :" + driver.getTitle());
        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle= driver.getTitle();
        String istenen="Amazon";
        if(actualTitle.contains(istenen)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //Sayfa adressini yazdırın
        driver.getCurrentUrl();
        System.out.println("Sayfanin URL i:" +driver.getCurrentUrl());
        //Sayfa UrL inin "amazon icerdigini tesst test edin
        String URL=driver.getCurrentUrl();
        String istenen2="amazon";
        if( URL.contains(istenen2)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TESST FAILED");
        }
        //Sayfa handle degerini yazdirin
        driver.getWindowHandle();
        System.out.println("Handle Degeri:" + driver.getWindowHandle());
        //Sayfa HTML kodlarında "Gateway" kelimesi gectigini tesst edin

        String pagesource=driver.getPageSource();
        String istenen3="Gateway";
        if(pagesource.contains(istenen3)){
            System.out.println("TEST PASSED");
        }
        else{
            System.out.println("TEST FAILED");
        }


        //Sayfayi kapatin
        driver.close();

















    }
}
