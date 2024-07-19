package Scroll_in_Selenium_By_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Till_the_Top_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockniti.in/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(1000);
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,2555)");
		Thread.sleep(3000);
		//js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		js.executeScript("window.scrollTo(0,1000)"); 
		Thread.sleep(2000);
		driver.quit();
		

	}

}
