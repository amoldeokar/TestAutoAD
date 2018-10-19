package JUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@Test
	public final void testGetInterest() {
		int expinterest=200;
		int Ainterest = Account.getInterest(1000, 2, 10);
	   
		assertEquals(expinterest, Ainterest);
	
	}
	
	
	
	@Test
	public final void testGetList() {
		ArrayList list=Account.getList();
		assertEquals(10, list.get(0));
		assertEquals(4, list.size());
		assertEquals(30, list.get(2));
		assertTrue(list.contains(10));
		assertFalse(list.isEmpty());		
		}

	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
