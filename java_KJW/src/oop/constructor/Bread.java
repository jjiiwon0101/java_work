package oop.constructor;

public class Bread {
	
	int price;
	String name;
	String ingredient;
	
	Bread() {} //항상 내가 만든 생성자로 만들어주지 않는다.
	
	Bread(String bName, String bIngredient, int bPrice) {
		System.out.println("피자빵 호출!"); 
		name = bName;
		ingredient = bIngredient;
		price = bPrice;
	}
	
    			 
     

	void info() {
 		System.out.println("***빵의 정보***");
 		System.out.println("빵 이름: " + name);
 		System.out.println("가격: " + price + "원");
 		System.out.println("주 재료: " + ingredient);

     }
}
