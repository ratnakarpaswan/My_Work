 package seleniunBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_By_Xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("http://altoro.testfire.net/login.jsp");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr/td[2]/input")).sendKeys("jsmith");
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/ul/li[3]/a")).click();
		 Thread.sleep(2000);
	}

}
