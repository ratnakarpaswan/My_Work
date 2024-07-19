package seleniunBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_3_in_selenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(1000);
	Alert al=	driver.switchTo().alert();
	Thread.sleep(1000);
	al.sendKeys("hello this is the first");
	Thread.sleep(1000);
	al.accept();
	//al.dismiss();
   WebElement output=	driver.findElement(By.id("output"));
   String str= output.getText();
   System.out.println(str);
   driver.quit();
	}

}
