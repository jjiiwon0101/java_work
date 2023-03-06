package oop.inherit.good;

public class Mage extends Player {

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("#분노: " + mana);
	}

	int mana;
	
	
	

	
	

}
