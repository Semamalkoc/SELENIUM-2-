package techproed.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement aramakutusu=driver.findElement(By.xpath("//*[@type='text']"));
        aramakutusu.sendKeys("city bike" , Keys.ENTER);
       driver.findElement (By.xpath("//*[text()='Hybrid Bikes']")).click();
        WebElement sonucyazisi=driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucyazisi.getText());

        String [] sonucsayisi=sonucyazisi.getText().split(" ");
        System.out.println("sonucsayisi: " + sonucsayisi[0]);

        driver.findElement(By.xpath("(//h2)")).click();

         driver.close();





    }
}
