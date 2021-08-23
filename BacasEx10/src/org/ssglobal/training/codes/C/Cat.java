package org.ssglobal.training.codes.C;

public class Cat extends Mammal {

	@Override
	boolean givesMilk() {
		return true;
	}

	@Override
	String makeSound() {
		return "Meow";
	}

	@Override
	boolean givesLiveBirth() {
		return true;
	}
	
}