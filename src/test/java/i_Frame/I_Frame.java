package i_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		//driver.findElements(By.id("name")).sendKeys("Text at Main frame");
		driver.findElement(By.id("name")).sendKeys("Text at Main frame");
		
		int i = driver.findElements(By.tagName("iframe")).size();// to check the number of frame present on that page
		
		System.out.println("Number of I-Frames si : "+i);
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
	WebElement we=	driver.findElement(By.id("ide"));
		Select sl= new Select(we);
		sl.selectByIndex(1);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("input at Main Page");
		driver.quit();
		
		
		

	}

}
