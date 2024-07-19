package Scroll_in_Selenium_By_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_method {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver= new FirefoxDriver();
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 driver.navigate().to("https://stockniti.in/");
	 Thread.sleep(1000);
	 js.executeScript("window.scroll(0,2000)");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@id='scroll-top']")).click();
//	 
//	 driver.close();
	 
  
	}

}
