package com.bike;

public abstract class Bike {

	int noOfWheel = 2;

	public abstract void speed();

	public void wheel() {
		System.out.println("No of wheel : " + noOfWheel);
	}
}