package seleniunBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler_Tab {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		//ChromeOptions options = new ChromeOptions();
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.navigate().to("https://www.w3schools.com/java/java_operators.asp");
		Thread.sleep(2000);
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent window");
		
		driver.findElement(By.xpath("(//a[@class='w3-btn'])[1]")).click();
		//options.addArguments("--disable-notifications");
		
		//driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
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
		driver.findElement(By.xpath("(//a[@class='w3-btn'])[2]")).click();
		Set<String> C2window=driver.getWindowHandles();
		for(String str:C2window) {
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
		driver.findElement(By.xpath("(//a[@class='w3-btn'])[3]")).click();
		Set<String> C3window=driver.getWindowHandles();
		for(String str:C3window) {
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
		driver.findElement(By.xpath("//button[@class='w3-btn w3-margin-bottom']")).click();
		Set<String> C4window=driver.getWindowHandles();
		for(String str:C4window) {
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
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='name']")).clear();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text after child then parent window");
		driver.quit();
		
		
	}
	

}
