package oop.encap.good;

//import oop.encap.good.MyBirth;

public class MainClass {

	public static void main(String[] args) {
		
		Mybirth my = new Mybirth();
		
		my.setYear(1995);
		
		
//		System.out.printlf("내 생일은 %d년 입니다.\n", my.getYear("abc1234"));
		
		/*
    - month와 day의 setter / getter 메서드를 선언하세요.
    - month: 1 ~ 12
    - day: 1 ~ 31
    - getter 메서드는 따로 비밀번호 등 권한 검사 없이
     바로 return 속성값 해 주세요.
		 */
		
		Mybirth mn = new Mybirth();
		mn.setMonth(10);
		
		Mybirth d = new Mybirth();
		d.setDay(13);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다. \n"
				, my.getYear("abc1234"), mn.getMonth(), d.getDay());
		

	}

}
