/**
 * 
 */
package com.imie.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Cyril
 *
 */
public class AdditionTest {
	
	private Addition add;

	@Before
	public void setUp() throws Exception {
		// Lancé avant chaque test
		this.add = new Addition(1);
	}

	public void tearDown() throws Exception {
		// Lancé après chaque test
		this.add = null;
	}

	@Test
	public void testAddition() {
		// Assert.assertNotNull(this.add);
		Assert.assertEquals(1, this.add.value);
	}

	@Test
	public void testMake() {
		this.add.make(2);
		
		// Assert.assertNotNull(this.add);
		Assert.assertEquals(3, this.add.value);
	}

	@Test
	public void testGetValue() {
		// Assert.assertNotNull(this.add);
		Assert.assertEquals(1, this.add.value);
	}

}
