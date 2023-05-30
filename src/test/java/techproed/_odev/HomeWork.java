package techproed._odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tr-tr.facebook.com/");
        System.out.println("sayfa basligi:" + driver.getTitle());
        String title=driver.getTitle();
        String aranan="facebook";
        if(title.contains(aranan)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println(driver.getTitle());
        }



        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
       String URL= driver.getCurrentUrl();
        System.out.println(URL);
        if(URL.contains("facebook")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println(URL);
        }
       // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String baslik=driver.getTitle();
        if(baslik.contains("Walmart.com")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7.Sayfayi yenileyin
        driver.navigate().refresh();
        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.9.Browser’i kapatin
        driver.close();















    }
}
