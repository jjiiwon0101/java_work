package oop.constructor;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	int tall;
	
	Person() {} //기본 생성자
	
	Person(String pName, int pAge, int pTall) {
		System.out.println("호출!!");
		name = pName;
		age = pAge;
		tall = pTall;
	}
//    Scanner sc = new Scanner(System.in);
     
	void info() {
		System.out.println("사람의 정보>>");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + tall);
	}
	

}


