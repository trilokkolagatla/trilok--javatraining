package com.github.trilokkolagatla.project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.trilokkolagatla.project.*;

public class BittTest {

	@Test
	public void postiveTest() {
		Bitt b=new Bitt();
		String str=b.returnbit(78);
		assertEquals("4E",str);
	}
		
		@Test
		public void negtiveTest() {
			Bitt b=new Bitt();
			String str=b.returnbit(-1);
			assertEquals("Decimal to hexadecimal:",str);
	
	}

}
