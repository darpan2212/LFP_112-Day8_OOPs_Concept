package com.bike;

public class SpecialBike extends Bike {

	public SpecialBike() {
		noOfWheel = 3;
	}

	@Override
	public void speed() {
		System.out.println("Speed limit : 60");
	}

}
