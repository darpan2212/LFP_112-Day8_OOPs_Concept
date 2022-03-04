package com.bike;

import org.junit.Test;

public class TestBike {

	@Test
	public void testAbstract() {
		
		Honda honda = new Honda();
		honda.wheel();
		honda.speed();
		
		SpecialBike sb = new SpecialBike();
		sb.wheel();
		sb.speed();
	}
	
}