package com.animal;

import org.junit.Test;

public class TestClient {

	@Test
	public void testInheritance() {
		Dog dog = new Dog();
		dog.breed = "Pug";
		dog.name = "Rocky";
		dog.speak();
		dog.eat();
		dog.intro();

		Cat cat = new Cat();
		cat.name = "kitty";
		cat.color = "white";
		cat.speak();
		cat.eat();
		cat.intro();

		BabyDog babyDog = new BabyDog();
		babyDog.height = 1.2;
		babyDog.breed = "Huskey";
		babyDog.name = "Lucy";
		babyDog.eat();
		babyDog.speak();
		babyDog.intro();
		babyDog.play();
	}

}