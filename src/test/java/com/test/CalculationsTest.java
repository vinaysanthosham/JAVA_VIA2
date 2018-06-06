package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.Calculations;

public class CalculationsTest {
	
	Calculations calc = new Calculations();

	@Test
	public void testAdd() {
		//fail("Not yet implemented"); // TODO
		assertEquals(50, calc.add(25, 25));
	}

	@Test
	public void testSquare() {
		//fail("Not yet implemented"); // TODO
		assertEquals(90, calc.square(10.0));
	}

}
