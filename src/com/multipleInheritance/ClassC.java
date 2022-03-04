package com.multipleInheritance;

public class ClassC implements ClassA, ClassB {

	@Override
	public void run() {
		System.out.println("Running");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}

}