/**
*Project:Delivery
*File:OrderTest.java
*Date:Sep 24, 2018
*Time:4:07:48 PM 
 */
package test;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import operation.EmptyStringException;
import operation.intDefaultValueException;
import types.Order;

/**
 * @author Mozhgan Moghanian 
 *
 */
public class OrderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link types.Order#Order()}.
	 */
	@Test 
	public void testOrderNullInfo() {
		try {
			Order o = new Order(1, 1, null, null, null, null, null, 1);
			fail();
		} catch (intDefaultValueException e) {
			fail();
		}catch (NullPointerException e) {
			//Expected
		}catch (EmptyStringException e) {
			fail();
		}
	}

	/**
	 * Test method for {@link types.Order#Order(int, int, java.util.Date, java.sql.Time, java.sql.Time, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testOrderNullInt() {
		Time t1 = new Time(11, 11, 11);
		Time t2 = new Time(11, 11, 12);
		Date date = new Date();

		try {
			Order o = new Order(0, 0, date, t1, t2, "", " ", 0);
			fail();
		} catch (intDefaultValueException e) {
			//Expected
		}catch (NullPointerException e) {
			fail();
		}catch (EmptyStringException e) {
			fail();
		}
	}

	/**
	 * Test method for {@link types.Order#Order(int, int, java.util.Date, java.sql.Time, java.sql.Time, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testOrderEmptyStringInput() {
		Time t1 = new Time(11, 11, 11);
		Time t2 = new Time(11, 11, 12);
		Date date = new Date();

		try {
			Order o = new Order(1, 1, date, t1, t2, "hi", ""
					+ ""
					+ ""
					+ "					", 1);
			fail();
		} catch (intDefaultValueException e) {
			fail();
		}catch (NullPointerException e) {
			fail();
		}catch (EmptyStringException e) {
			//Expected
		}
	}

	/**
	 * Test method for {@link types.Order#Order(int, int, java.util.Date, java.sql.Time, java.sql.Time, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testOrderEmptyStringInput2() {
		Time t1 = new Time(11, 11, 11);
		Time t2 = new Time(11, 11, 12);
		Date date = new Date();

		try {
			Order o = new Order(1, 1, date, t1, t2, "hi", "", 1);
			fail();
		} catch (intDefaultValueException e) {
			fail();
		}catch (NullPointerException e) {
			fail();
		}catch (EmptyStringException e) {
			//Expected
		}
	}

	/**
	 * Test method for {@link java.lang.Object#Object()}.
	 */
	@Ignore
	public void testObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#getClass()}.
	 */
	@Ignore
	public void testGetClass() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#hashCode()}.
	 */
	@Ignore
	public void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Ignore
	public void testEquals() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	@Ignore
	public void testClone() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notify()}.
	 */
	@Ignore
	public void testNotify() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notifyAll()}.
	 */
	@Ignore
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long)}.
	 */
	@Ignore
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long, int)}.
	 */
	@Ignore
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait()}.
	 */
	@Ignore
	public void testWait() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Ignore
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
