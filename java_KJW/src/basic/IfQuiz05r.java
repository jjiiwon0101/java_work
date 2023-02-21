package basic;

import java.util.Scanner;

public class IfQuiz05r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 
		 */
		
		System.out.println("정수a: ");
		int n1 = sc.nextInt();
		System.out.println("정수b: ");
		int n2 = sc.nextInt();
		System.out.println("정수c: ");
		int n3 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + "이(가) 큰 수 입니다.");
		} else if(n1 < n2) {
			System.out.println(n2 + "이(가) 큰 수 입니다.");
			
		if (n2 > n3) {	
		} else if(n2 < n3) {
			System.out.println(n3 + "이(가) 큰 수 입니다.");
		} 
		if(n3 < n1) {
			System.out.println(n1 + "이(가) 큰 수 입니다.");
		} else if(n3 > n1) {
			System.out.println(n3 + "이(가) 큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}
		
		sc.close();

	}

	}
}
