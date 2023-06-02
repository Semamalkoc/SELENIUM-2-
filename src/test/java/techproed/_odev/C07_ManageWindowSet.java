package techproed._odev;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // 1.Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfanın konumu:" +driver.manage().window().getPosition());
        System.out.println( "sayfanın boyutları:"+ driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde
       // ayarlayin
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));




        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test
        //edin
        System.out.println("satfanın konumu:" +driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları:" +driver.manage().window().getSize());
       // 8. Sayfayi kapatin
        driver.close();


















    }
}
