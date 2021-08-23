package org.ssglobal.training.codes.C;

public class Whale extends Mammal {

	@Override
	boolean givesMilk() {
		return true;
	}

	@Override
	String makeSound() {
		return "[whale song]";
	}

	@Override
	boolean givesLiveBirth() {
		return true;
	}

}