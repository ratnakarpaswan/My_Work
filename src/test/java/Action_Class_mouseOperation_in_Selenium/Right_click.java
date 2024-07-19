package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement right=	driver.findElement(By.xpath("//span[text()='right click me']"));
		
		act.contextClick(right).build().perform();
		WebElement cut= driver.findElement(By.xpath("//span[text()='Cut']"));
		act.click(cut).build().perform();
		Alert  al = driver.switchTo().alert();
		Thread.sleep(1000);
	String text=	al.getText();
	System.out.println(text);
	Thread.sleep(1000);
	al.accept();
		
		

	}

}
