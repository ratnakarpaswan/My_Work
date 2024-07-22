package TestNG_Code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTest {
  @Test
  public void TestCase1() {
	  System.out.println("Inside the  TestCase1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside the  beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside the afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside the  beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside the afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside the  beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside the  afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside the  beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside the  afterSuite");
  }

}
