package use_by_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Heighlite_different_element {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://altoro.testfire.net/bank/main.jsp");
		Thread.sleep(1000);
		js.executeScript("document.getElementsByTagName('h1')[0].style.background='red'");
		Thread.sleep(1000);
		js.executeScript("document.getElementsByName('btnSubmit')[0].style.border='10px solid red'");
		
		Thread.sleep(2000);
		

	}

}
