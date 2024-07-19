package Wait_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_in_selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000); // static wait 2 second
		driver.findElement(By.id("txt1")).sendKeys("custom text");// Because this field will be appear after 5 sec and the static wait is 2 sec so it will throw an error
		

	}

}
