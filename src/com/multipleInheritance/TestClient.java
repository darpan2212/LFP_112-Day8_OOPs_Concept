package com.multipleInheritance;

import org.junit.Test;

public class TestClient {

	@Test
	public void testMultipleInheritance() {
	
		ClassC c = new ClassC();
		c.run();
		c.sleep();
		System.out.println(ClassA.a);
		System.out.println(ClassB.a);
	}
	
}