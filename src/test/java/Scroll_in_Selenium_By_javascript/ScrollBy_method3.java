package Scroll_in_Selenium_By_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy_method3 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 driver.navigate().to("https://stockniti.in/");
	 //driver.navigate().to("https://www.hyrtutorials.com/");
	 Thread.sleep(1000);
	 js.executeScript("window.scrollTo(0,1000)");
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,500)");
	 //driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@id='scroll-top']")).click();
	 Thread.sleep(2000);
	 //driver.quit();
	 driver.close();
	 
  
	}

}
