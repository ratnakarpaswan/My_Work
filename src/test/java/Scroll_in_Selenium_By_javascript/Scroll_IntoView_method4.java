package Scroll_in_Selenium_By_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_IntoView_method4 {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 driver.navigate().to("https://stockniti.in/");
	 //driver.navigate().to("https://www.hyrtutorials.com/");
	 Thread.sleep(1000);
	WebElement we= driver.findElement(By.xpath("//button[@class='elementor-button elementor-size-sm']"));
	 //WebElement we= driver.findElement(By.className("elementor-button elementor-size-sm"));
	js.executeScript("arguments[0].scrollIntoView()",we);
//	Thread.sleep(1000);
	we.click();
	 Thread.sleep(2000);
	 //driver.quit();
	 //driver.close();
	 
  
	}

}
