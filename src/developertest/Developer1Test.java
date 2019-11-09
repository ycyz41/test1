package developertest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Developer1Test {
	Developer1 temp=new Developer1();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTest1() {
		assertEquals("Hello,world", temp.test1("hello,world"));
		assertEquals("", temp.test1(""));
	}

	@Test(timeout = 4000)
	public void testTest2() {
		assertEquals(5, temp.test2(5));
	}

	@Test
	public void testTest3() {
		assertEquals("yes", temp.test3(1));
		assertEquals("no", temp.test3(0));
		assertEquals("", temp.test3(2));
	}

}
