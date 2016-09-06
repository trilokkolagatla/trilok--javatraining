package com.github.trilokkolagatla.project;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.trilokkolagatla.project.*;

public class swaptestpass {
	@Test
	public void positiveTest() {
		swap s = new swap();
		int[] swap={3,4};
		int actual=swap.length;
		assertEquals(3, actual);
		assertEquals(4,actual);
	}

}
