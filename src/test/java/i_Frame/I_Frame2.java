package i_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_Frame2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		//driver.findElements(By.id("name")).sendKeys("Text at Main frame");
		driver.findElement(By.id("name")).sendKeys("Text at Main frame");
		driver.switchTo().frame("frm3");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Input at frame 3 page");
	
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
	WebElement we=	driver.findElement(By.id("selectnav1"));
		Select sl= new Select(we);
		sl.selectByIndex(2);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Input at frame 3  after child frame page");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("input at Main Page");
		driver.quit();
		
		
		

	}

}
