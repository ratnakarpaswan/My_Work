package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrageAndDrop_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		driver.get("https://jqueryui.com/sortable/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
	WebElement source=	driver.findElement(By.xpath("//li[text()='Item 1']"));
	Thread.sleep(1000);
	//act.dragAndDropBy(source, 0,180).release().build().perform();
	//act.clickAndHold(source).moveToElement(source, 0, 130).release().build().perform();
	
	act.clickAndHold(source).moveByOffset(0, 130).release().build().perform();
	//act.dragAndDropBy(source, 60, 60).release().build().perform();
	//act.clickAndHold(source).moveToLocation(0,130).release().build().perform(); //only this method is not working
	Thread.sleep(3000);
	}

}
