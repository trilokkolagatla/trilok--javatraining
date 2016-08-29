package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SrootTest {

	@Test
	public void postiveTest() {
		Sroot s=new Sroot();
		int actual=(int)Sroot.calculateSqrt(144);
		assertEquals(12, actual);
	}
	


}
