package use_by_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByJava_Value_Inter_By_JacaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(1000);
         JavascriptExecutor js= (JavascriptExecutor)driver;
         driver.get("https://altoro.testfire.net/bank/main.jsp");
         Thread.sleep(1000);
         WebElement Uname=  driver.findElement(By.id("uid"));
         js.executeScript("arguments[0].value='jsmith'", Uname);
        
         WebElement pass=driver.findElement(By.name("passw"));
         js.executeScript("arguments[0].value='demo1234'", pass);
         
         WebElement login= driver.findElement(By.name("btnSubmit"));
         js.executeScript("arguments[0].click()",login);
         
  //  Both code are work same       
//         
//         WebElement Uname=  driver.findElement(By.id("uid"));
//         WebElement pass=driver.findElement(By.name("passw"));
//         WebElement login= driver.findElement(By.name("btnSubmit"));
//         js.executeScript("arguments[0].value='jsmith'", Uname);
//         js.executeScript("arguments[0].value='demo1234'", pass);
//         js.executeScript("arguments[0].click()",login);
         
	}

}
