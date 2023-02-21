package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰지 
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫 번째 수 입력: ");
		int number1 = sc.nextInt();
		System.out.println("두 번째 수 입력: ");
		int number2 = sc.nextInt();
		
		if(number1 >= number2) {
			System.out.println(number1 + "큰 수 입니다.");
		} else if(number2 >= number1) {
			System.out.println(number2 + "큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}
		
	sc.close();
		

	}

}
