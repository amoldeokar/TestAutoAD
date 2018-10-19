/**
 * 
 */
package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author admin
 *
 */
public class JUnit1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Inside Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Inside After");
	}

	@Test
	public void test1() {
		System.out.println("Inside Test1");
		//fail("Not yet implemented");
	}

	@Test(timeout=1000)
	public void test2() {
		System.out.println("Inside Test2");
		//fail("Not yet implemented");
	}
	
	@Ignore
	public void test3() {
		System.out.println("Inside Test3");
		//fail("Not yet implemented");
	}

}
