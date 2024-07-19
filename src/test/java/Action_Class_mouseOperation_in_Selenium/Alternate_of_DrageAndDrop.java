package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alternate_of_DrageAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
	WebElement source=	driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(1000);
	//act.dragAndDrop(source, target).release().build().perform();
	//act.dragAndDropBy(source, 165, 25).release().build().perform();
	act.clickAndHold(source).moveToElement(target).release().build().perform();
		

	}

}
