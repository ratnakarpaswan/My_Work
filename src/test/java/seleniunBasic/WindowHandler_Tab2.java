package seleniunBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler_Tab2 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		//ChromeOptions options = new ChromeOptions();
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		Thread.sleep(2000);
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent window");
		
	
		
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> Cwindow=driver.getWindowHandles();
		for(String str:Cwindow) {
			if(!str.equals(pwindow)) {
			driver.switchTo().window(str);
			Thread.sleep(1000);
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(1000);
			driver.close();
		}
		}
		driver.switchTo().window(pwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent window after returnback child window");
		driver.quit();
		
		
		
		
		
	}
	

}
