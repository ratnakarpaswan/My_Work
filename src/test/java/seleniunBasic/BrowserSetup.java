package seleniunBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver =new EdgeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.get("https://www.gtccabs.com/sign-in");
//		driver.findElement(By.id("Email")).sendKeys("anoop7379@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("9876");
//		driver.findElement(By.className("signin-btn")).click();
		
		driver.get("http://altoro.testfire.net/login.jsp");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td[4]/div/a")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("132371312");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		Thread.sleep(1000);
		//driver.findElement(By.className("btn btn-primary login-btn")).click();
		driver.findElement(By.name("passw")).sendKeys("demo1234");
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Transfer Funds")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("View Recent")).click();
        Thread.sleep(2000);
        driver.findElement(By.tagName("img")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("subheader")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000); 
        driver.navigate().forward();
        Thread.sleep(3000);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver= new FirefoxDriver();

	}

}
