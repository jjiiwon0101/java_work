package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		/*
		 -스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: xxx
		 나이: xx세
		 출생년도: xxxx년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고 
		 출생년도는 입력사항이 아닙니다.)
	     */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름: ");
	    String name = sc.next();
	    
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.close();
		
		
		System.out.printf("\n이름: %s\n", name);
		System.out.printf("\n나이: %d\n", age);
		System.out.printf("출생년도 %d\n", 2023 - age);
		

	}

}
