package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LerningTestNG {
  @Test(dataProvider = "dp")
  public void test1(Integer n, String s) {
	   System.out.println("Test1 is a test1 method with values - " + n);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2 is a test1 method with values");
  }
  
  @Test
  public void test3() {}
  


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" @AfterSuite");
  }

}
