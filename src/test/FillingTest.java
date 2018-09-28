package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import helper.Filling;

public class FillingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testcalculatePriority() {
		try {
			Filling.calculatePriority(null);
			fail();
		}catch (NullPointerException e) {
			//Expected
		} catch (Exception e) {
			fail();
		}
	}

}
