package Drop_down_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drope_down_in_selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//driver.navigate().to("https://www.w3schools.com/java/java_operators.asp");
		Thread.sleep(2000);
	WebElement dropdown=driver.findElement(By.id("course"));
	Select sl= new Select(dropdown);
	// Select  BY Index
	sl.selectByIndex(0);
	Thread.sleep(3000);
	sl.selectByIndex(1);
	Thread.sleep(3000);
	sl.selectByIndex(2);
	Thread.sleep(3000);
	sl.deselectAll();
	
 //  Select BY Visible Text 	
//	sl.selectByVisibleText("Java");
//	Thread.sleep(3000);
//	sl.selectByVisibleText("Python");
//	Thread.sleep(3000);
//	sl.selectByVisibleText("Dot Net");
//	Thread.sleep(3000);
	 
	// select BY Value
//	sl.selectByValue("java");
//	Thread.sleep(3000);
//	sl.selectByValue("net");
//	Thread.sleep(3000);
//	sl.selectByValue("js");
//	Thread.sleep(3000);

	}

}
