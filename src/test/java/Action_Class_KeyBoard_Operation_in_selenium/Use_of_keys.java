package Action_Class_KeyBoard_Operation_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Use_of_keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		driver.get("https://the-internet.herokuapp.com/key_presses");
		//act.sendKeys(Keys.ALT).build().perform();
		Thread.sleep(1000);
		//act.sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		WebElement we=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(we.getText());

	}

}
