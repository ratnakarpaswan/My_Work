package Action_Class_mouseOperation_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover_on_element_by_moveToElement {

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
	Thread.sleep(2000);
    WebElement menfw=	driver.findElement(By.xpath("//a[text()='Men Footwear']"));
    act.moveToElement(menfw).build().perform();
    Thread.sleep(2000);
    WebElement shoecare= driver.findElement(By.xpath("//a[text()='Shoe Care']"));
    act.click(shoecare).build().perform();

	}

}
