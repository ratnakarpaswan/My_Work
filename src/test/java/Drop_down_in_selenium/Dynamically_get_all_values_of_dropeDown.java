	package Drop_down_in_selenium;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamically_get_all_values_of_dropeDown {



		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			Thread.sleep(3000);
		//List<WebElement> lst=driver.findElements(By.id("course"));
		 WebElement dropdown= driver.findElement(By.id("course"));
		  Select sl= new Select(dropdown);
		  List< WebElement> lst=sl.getOptions();
		for(WebElement we:lst) {
			String str= we.getText();
			System.out.println(str);
			sl.selectByVisibleText(str);
			Thread.sleep(3000);
		}
		
		}
}
