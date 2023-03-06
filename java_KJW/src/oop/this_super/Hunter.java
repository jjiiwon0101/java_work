package oop.this_super;

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
	
	

}
