package techproed.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       WebElement addElementButton=driver.findElement(By.cssSelector("button[onclick='addElement()']")) ;
       Thread.sleep(3000);
        addElementButton.click();
WebElement deleteButton=driver.findElement(By.cssSelector("button[class='added-manually']"));
    if(deleteButton.isDisplayed()){
        System.out.println("test passed");
    }else{
        System.out.println("test failed");
    }
    deleteButton.click();
    Thread.sleep(2000);
    WebElement addRemoveElements=driver.findElement(By.cssSelector("h3"));
    if(addRemoveElements.isDisplayed()){
        System.out.println("test passed");
    }else{
        System.out.println("test failed");
    }
    driver.close();





    }
}
