package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize_the_Element {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		driver.get("https://jqueryui.com/resizable/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
	WebElement source=	driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	Thread.sleep(1000);
	act.dragAndDropBy(source, 300, 150).release().build().perform();
	//act.clickAndHold(source).moveToElement(source, 250, 100).release().build().perform();
	//act.clickAndHold(source).moveByOffset(300, 100).release().build().perform();
	
	Thread.sleep(3000);
	}

}
