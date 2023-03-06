package oop.this_super;

public class Mage extends Player {

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마력: " + mana);
	}

	int mana;
	Mage(String name) {
		super(name);
		this.mana = 80;
	}
	
	
	

	
	

}
