package oop.poly.player;

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
	
	public void rush (Player p) {
		Mage target = null;
	}
	
	
	

	
	

}
