package com.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.*;

public class swaptestpass {
	@Test
	public void positiveTest() {
		swap s = new swap();
		int actualValue = s.returnswap(3,4);
		assertEquals(3, actualValue);
	}

}
