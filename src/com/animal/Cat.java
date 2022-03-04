package com.animal;

public class Cat extends Animal {

	String color;

	public void speak() {
		System.out.println("Meow...!!!");
	}

	public void intro() {
		System.out.println(name + " is " + color + " color cat.");
	}

}