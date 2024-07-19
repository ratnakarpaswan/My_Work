package Window_Handler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandler_Tab3 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		//ChromeOptions options = new ChromeOptions();
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		String bc="";
		String cm="";
		String xp="";
		String ad="";
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		Thread.sleep(2000);
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent window");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> Cwindow=driver.getWindowHandles();
		for(String str:Cwindow) {
			if(!str.equals(pwindow)) {
			driver.switchTo().window(str);
			Thread.sleep(1000);
			String title=driver.getTitle();
			if(title.contains("Basic Controls")) {
				bc=str;
				System.out.println(bc);
			}
			else if(title.contains("Contact Me")) {
				cm=str;
				System.out.println(cm);
			}
			else if(title.contains("XPath Practice")) {
				xp=str;
				System.out.println(xp);
			}
			else if(title.contains("AlertsDemo")) {
				ad=str;
				System.out.println(ad);
			}
			
		}
		}
		//Working on Basic Control
		
		driver.switchTo().window(bc);
		Thread.sleep(2000);
		String str4= driver.getTitle();
		System.out.println(str4);
		
		driver.close();
		
		// Working on Contact me
		
		driver.switchTo().window(cm);
		Thread.sleep(2000);
		String str1= driver.getTitle();
		System.out.println(str1);
		driver.close();
		
		// Working on Xpath practice
		
		driver.switchTo().window(xp);
		Thread.sleep(2000);
		String str2= driver.getTitle();
		System.out.println(str2);
		driver.close();
		
		// Working on AlertDemo
		
		driver.switchTo().window(ad);
		Thread.sleep(2000);
		String str3= driver.getTitle();
		System.out.println(str3);
		driver.close();
		
		
		// Working On parent window
		driver.switchTo().window(pwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent window after returnback child window");
		driver.quit();
		
		
		
		
		
	}
	

}
