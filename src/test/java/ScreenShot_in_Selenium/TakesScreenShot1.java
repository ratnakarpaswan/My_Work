package ScreenShot_in_Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShot1 {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	String path= "C:\\Users\\ratna\\eclipse-workspace\\GTC001\\Screenshot\\image1.png"	;
	File targetFile= new File(path);	
	try {
		FileUtils.copyFile(srcFile, targetFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}
}
