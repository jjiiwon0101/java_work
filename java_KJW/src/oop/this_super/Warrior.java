package oop.this_super;

 
public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		// 모든 생성자에는 super()가 내장되어 있습니다.
		// 자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야
		// 부모의 속성과 기능이 실존하게 되고, 물려 줄 수가 있기 때문입니다.
		super(name); //부모의 생성자 직접 지목
//		this.name = name;
	    this.rage = 60;
	}

	@Override 
	void characterInfo() {//부모가 물려준거에서 한줄만 추가하겠다!
		super.characterInfo();
		System.out.println("# 분노: " + rage);
		
	}
	
	
	
	
	
		
		
	}


