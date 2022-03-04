package com.animal;

public class Dog extends Animal {

	String breed;

	public void speak() {
		System.out.println("Barking...!!!!");
	}

	@Override
	public void eat() {
		System.out.println("Dog food....!!");
	}
	
	public void intro() {
		System.out.println(name + " is " + breed + " breed Dog.");
	}
}