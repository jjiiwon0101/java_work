package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		/*
		 입력받은 수의 약수의 총합을 구하세요.
		 입력받은 값: 12 -> 1, 2, 3, 4, 6, 12 -> 28
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		int y = 1; //begin
		int b = 0; //누적합을 담아줄 변수
		
		while(y <= x) { //x가 가장 큰 수라서
			if(x % y == 0) {
				b += y;
			}
			y++;
			
		} System.out.println("약수의 총합: " + b);
		
		sc.close();

	}

}
