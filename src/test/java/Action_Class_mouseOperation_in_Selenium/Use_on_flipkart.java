package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Use_on_flipkart {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions act= new Actions(driver);
	WebElement fashion=	driver.findElement(By.xpath("//span[text()='Fashion']"));
	act.moveToElement(fashion).build().perform();
	
    WebElement womenEth=	driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
    Thread.sleep(1000);
    act.moveToElement(womenEth).build().perform();
    
    WebElement ethdress= driver.findElement(By.xpath("//a[text()='Ethnic Dresses']"));
    Thread.sleep(1000);
    act.click(ethdress).build().perform();

	}

}
