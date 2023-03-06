package oop.inherit.good;

public class Hunter extends Player {
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("#분노: " + pet);
	}

	int pet;
	
	

}
