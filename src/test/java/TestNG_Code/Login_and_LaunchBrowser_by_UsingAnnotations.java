package TestNG_Code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_and_LaunchBrowser_by_UsingAnnotations {
        public static WebDriver driver;  // we create instance on the class level for use by all methods 
	public static JavascriptExecutor js; // instance of the javaScriptExecutor on class level
	
	
	@BeforeTest
  public void init() {
	  WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   js = (JavascriptExecutor) driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.manage().window().maximize();
	  
  }
  
	@Test
  public void login() {
	  
	  driver.get("https://demo.testfire.net/login.jsp");
	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  WebElement pwd = driver.findElement(By.id("passw"));
	  js.executeScript("arguments[0].value='demo1234'", pwd);
	  driver.findElement(By.name("btnSubmit")).click();
  }
	
	@Test
	
	public void verifylogin() {
     WebElement signoff=driver.findElement(By.xpath("//font[text()='Sign Off']"));
        if(signoff.isDisplayed()) {
	       System.out.println("User is successfully Login");
         }
      else {
	     System.out.println("Unable to Login");
       }
	
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {    // throws will always be use in the starting of the method where we use the throws exception 
		Thread.sleep(5000);
		driver.close();
	}
	
}
