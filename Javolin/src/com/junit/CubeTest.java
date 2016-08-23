package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Cube;

public class CubeTest {

	@Test
	public void postiveTest() {
		Cube c=new Cube();
		double num=c.returnCube(27);
		assertEquals(3.0,num, 0.001);
	}

}
