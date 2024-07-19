package Scroll_in_Selenium_By_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class How_to_save_javascript_in_a_veriable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://stockniti.in/");
       long re=(long) js.executeScript("return document.body.scrollHeight");
       js.executeScript("window.scrollTo(0,re)");
      Thread.sleep(3000);
      driver.close();
      // code Not working
	}

}
