package Scroll_in_Selenium_By_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTo_method2 {

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
	 //driver.findElement(By.xpath("back-to-top")).click();
	 driver.findElement(By.xpath("//a[@id='scroll-top']")).click();
	 //driver.close();
	 
  
	}

}
