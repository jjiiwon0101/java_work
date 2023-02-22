package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고 
		 결과를 말슴해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int result = 0;
		System.out.println("정수1: ");
		int point1 = sc.nextInt();
		
		System.out.println("정수2: ");
		int point2 = sc.nextInt();
		
		System.out.println("연산자를 입력하세요[+, -, *, /]: ");
		String wise = sc.next();
		
		
		switch(wise) {
		
		case "+":
			result = point1 + point2;
			break;
		case "-":
			result = point1 - point2;
			break;
		case "*":
			result = point1 * point2;
			break;
		case "/":
			if(point2 == 0) {
				System.out.println("연산할 수 없는 값입니다.");
				flag = true;
				break;
			}
			result = point1 / point2;
			break;
			
		default:
			flag = true;
			System.out.println("연산기호를 똑바로 입력하세요.");

		}
		if(flag == false) {
		System.out.printf("%d %s %d = %d",point1,wise,point2,result);}
       sc.close();
	}

}
