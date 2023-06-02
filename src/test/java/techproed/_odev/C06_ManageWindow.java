package techproed._odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

       // 1.Yeni bir Class olusturalim.C06_ManageWindow
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanin konumu:"+ driver.manage().window().getPosition());
        System.out.println("sayfanin boyutları: "+ driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

       // 6. Sayfanin konumunu ve boyutlarini maximize durumunda
        //yazdirin
        System.out.println("sayfanın konumu:" + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları:" + driver.manage().window().getSize());
        //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
       // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda
        //yazdirin
        System.out.println("sayfanın konumu:"+ driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları:" +driver.manage().window().getSize());
        //9. Sayfayi kapatin
        driver.close();
















    }
}
