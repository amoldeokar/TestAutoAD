package TestNG;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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


public class AccountTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] TestData() {
   
	  return new Object[][] {
      new Object[] { 1000,10,5,500 },
      new Object[] { 2000,10,5,1001 },
      new Object[] { 3000,10,5,1500 }
   };  
    
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  //Without Dataprovider
  @Test
  public void getInterest() {
	  int actualvalue=Account.getInterest(1000, 10, 5);
	  int expectedvalue=500;
	  
	  assertEquals(expectedvalue,actualvalue);
	  assertEquals(500,Account.getInterest(1000, 10, 5));
	  
  }
  
  //WITH DATAPROVIDER  
  @Test(dataProvider = "TestData")
  public void testInterest(int principal,int term,int interest,int expected ) 
  {
	  int actualvalue=Account.getInterest(principal, term, interest);
	  assertEquals(expected,actualvalue); 
	  
  }

  @Test
  public void getList() {
    
  }
}
