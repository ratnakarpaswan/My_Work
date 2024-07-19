package Action_Class_KeyBoard_Operation_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Compare {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(1000);
		Actions act= new  Actions(driver);
	WebElement input1=	driver.findElement(By.id("inputText1"));
	WebElement input2= driver.findElement(By.id("inputText2"))	;
	input1.sendKeys("I am a QA with Automation Engineer");
	// Ctrl+A
	act.keyDown(Keys.CONTROL);
	act.sendKeys("A");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	// CTRL+C
	act.keyDown(Keys.CONTROL);
	act.sendKeys("C");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	// Press TAB
	act.sendKeys(Keys.TAB).build().perform();
	
	// CTRL + V
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("V");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	driver.findElement(By.xpath("//button[@id='compareButton']")).click();
	Thread.sleep(1000);
	WebElement we=driver.findElement(By.xpath("//span[@class='messageForUser']"));
	Thread.sleep(1000);
	System.out.println(we.getText());

	}

}
