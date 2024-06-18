package com.smh.al.addition;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	public void test() {
		Addition add = new Addition();
		int actual = add.sum(10, 10);
		int expected = 20;
		
		assertEquals(expected, actual);
		
	}

}
