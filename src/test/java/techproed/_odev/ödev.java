package techproed._odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ödev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        List <WebElement> sonucYazisi=driver.findElements(By.className("1-16 of 22 results for"));
        System.out.println(sonucYazisi.get(0).getText());
//iphone aratınız

//çıkan sonuç yazısını konsola yazdırınız

//çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız











    }
}
