package com.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.*;

public class swaptestpass {
	@Test
	public void positiveTest() {
		swap s = new swap();
		int[] swap={3,4};
		int actualValue = swap.length;
		assertEquals(3, actualValue);
		assertEquals(4,actualValue);
	}

}
