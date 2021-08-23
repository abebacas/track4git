package org.ssglobal.training.codes.C;

public class Monkey extends Mammal {

	@Override
	boolean givesMilk() {
		return true;
	}

	@Override
	String makeSound() {
		return "Screech";
	}

	@Override
	boolean givesLiveBirth() {
		return true;
	}

}