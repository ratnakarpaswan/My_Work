package Wait_in_selenium;

import java.time.Duration;
//import java.util.NoSuchElementException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait_ExplicitWait_in_selenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
				
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
	WebElement we=	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@id='txt1'])[1]")));
		we.sendKeys("custom text");
//		driver.findElement(By.id("btn2")).click();
//	WebElement we1=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//		we1.sendKeys("text inside the second field");
		driver.quit();
		

	}

}
