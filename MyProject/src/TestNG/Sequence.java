package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
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

public class Sequence {
  
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }

	
  @Test(dataProvider = "dp",priority='0')
  public void f1(Integer n, String s) {
	System.out.println("in test method1 "+ n + s);  
  }
  
  @Test //(dataProvider = "dp")
  public void f2(Integer n, String s) {
	System.out.println("in test method2 "+ n + s);  
  }
  
  @Test (enabled = false)  /// just like ignore in JUnit
  public void f4(Integer n, String s) {
	System.out.println("in test method4 "+ n + s);
	
  }
  
  @Test (dataProvider = "dp",priority='2',groups = {"Group1"}) 
  public void f5(Integer n, String s) {
	System.out.println("in test method5 "+ n + s);
	
  }
  
  @Test (dataProvider = "dp",priority='1',groups = {"Group1"}) 
  public void f6(Integer n, String s) {
	System.out.println("in test method6 "+ n + s);
	
  }
  
  @Test (dataProvider = "dp",groups = {"Group1","Group2"}) 
  public void f7(Integer n, String s) {
	System.out.println("in test method7 "+ n + s);
	
  }
  
  @Test (dataProvider = "dp",groups={"group2"})
  public void f3(Integer n,String s) {
	System.out.println("in test method3 "+ n+s);  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in after suite");
  }
  
  @BeforeGroups("Group1")
  public void beforeGroups1() {
	  System.out.println("in before groups1");
  }

  @AfterGroups("Group1")
  public void afterGroups1() {
	  System.out.println("in after groups1");
  }
	  
  @BeforeGroups("Group2")
  public void beforeGroups2() {
		  System.out.println("in before groups2");
	  }

 @AfterGroups("Group2")
	  public void afterGroups2() {
		  System.out.println("in after groups2");
  }

}
