package techproed._odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar_Testi {
    public static void main(String[] args) {
       // Yeni bir class olusturun (TekrarTesti)
//Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
// eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
       String actuelTitle= driver.getTitle();
        System.out.println("baslık:"+ driver.getTitle());
        String istenen="youtube";
        if(actuelTitle.contains(istenen)){
            System.out.println(" TEST PASSED ");
        }else{
            System.out.println("TEST FAILED: " + actuelTitle);
        }
       // Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
       if(driver.getCurrentUrl().contains("youtube") ) {
           System.out.println("test passed");
       }else{
           System.out.println(driver.getCurrentUrl());
       }
       // Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().forward();
        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
          //      Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL yi yazdırın
        String amzBaslik=driver.getTitle();
        if(driver.getTitle().contains("Amazon")){
            System.out.println(    "test passed");
        }else{
            System.out.println(amzBaslik);
        }
       String URL= driver.getCurrentUrl();
        if(URL.contains("https://www.amazon.com/")){
            System.out.println("test passed");
        }else{
            System.out.println("URL");
        }

        //Sayfayi kapatin
        driver.close();
    }
}
