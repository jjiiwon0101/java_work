package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player(); //기본 생성자 호출
		p1.name = "전사1";
//		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("　\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		Player p2 = new Player("전사2");
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		Player p3 = new Player("전사3" ,200);
		p3.characterInfo();
		
		System.out.println("\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p3);
		
		System.out.println("\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		Warrior w1 = new Warrior("핀");
		w1.characterInfo();
		
		System.out.println("\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		Mage m1 = new Mage("버블검공주");
		m1.characterInfo();
		
		System.out.println("\n⊃ 彡♡ ( *˘ ³ ˘ ) ♡ミ ⊂\n");
		
		Hunter h1 = new Hunter("레몬백작");
		h1.characterInfo();

	}
	

}
