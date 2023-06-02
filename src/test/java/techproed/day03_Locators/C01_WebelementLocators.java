package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("werdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //Arama kutusunu locate edelim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone" , Keys.ENTER);


        //Bir web elementin locate sını birden fazla kullanacaksanız bir webelement te değişken olarak atayabilirsiiniz
        //Webelement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));şeklinde kullanabiliriz.
        //**1**Locate işlemi bittikten sonra eğer webelemte bir metin göndereceksek sendKeys methodu kullanırız.
        //**2***webelemente tıklayacaksak click() methodu kullanırız
        //***3** webelementin üzerindeki yazıyı lmak istiyorsak getText() methodunu kullnırız.
        //**4** sendkeys methodundan sonra yanı webelemetıe metın gonderdikten sonra keys. enter ile yada submıt() methodu ile manuel olarak
        //enter yaptığımız gibi otomasyonda da yapabiliriz





       //Arama kutusuna iphone yazdıralım ve aratalım
       //Sayfayı kapatalım

driver.close();






















    }
}
