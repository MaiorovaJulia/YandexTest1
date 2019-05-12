import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyFirstTest {
  //  private WebDriver driver;
  //  private WebDriverWait wait;

    public static void main (String[] args){
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\абвг\\IdeaProjects\\YandexTest1\\drivers\\chromedriver.exe");
     WebDriver driver =  new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
     driver.get("https://www.google.com/");
driver.navigate().to("https://yandex.ru/");
        driver.findElement(By.linkText("Маркет")).click();
        driver.findElement(By.linkText("Компьютерная техника")).click();
        driver.findElement(By.linkText("Ноутбуки")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[4]/div[1]/div[1]/a")).click();
        driver.navigate().back();
        driver.findElement (By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[4]/div[1]/div[1]/a")).click();
        driver.navigate().back();
driver.quit();
    }
}
