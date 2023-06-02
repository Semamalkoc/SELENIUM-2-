package techproed._odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {

        //1.Yeni bir Class olusturalim.C05_NavigationMethods
       // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       // 4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
       // 5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //7.Sayfayi kapatalim / Tum sayfalari kapatali
        driver.close();
        driver.quit();
















    }
}
