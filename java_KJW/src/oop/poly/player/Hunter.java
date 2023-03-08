package oop.poly.player;

public class Hunter extends Player {
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫: " + pet);
	}

	int pet;
	Hunter(String name) {
		super(name);
		this.pet = 70;
	}
	
	public void rush(Player p) {
		
	}
	
	

}
