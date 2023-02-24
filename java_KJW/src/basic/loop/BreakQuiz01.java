package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 사용자가 0을 입력하면 반복문을 탈출시키세요.
		 
		2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int cCount = 0; //반복문이 실행될때마다 초기화되면 안되기땜에 밖에있음
		int iCount = 0;
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			
			int rn1 = (int) ((Math.random()*100) + 1);
			//돌때마다 새로운 변수를 생성해야함
			int rn2 = (int) ((Math.random()*100) + 1);
			int num = (int) (Math.random()*2);
			//기호도 랜덤으로 돌려야하기에 작성
			
			int correct;
			if(num == 0) { //정답기준과 출력기준을 각각 정함
				System.out.printf("%d + %d = ???\n", rn1, rn2);
				correct = rn1 + rn2;
			} else {
				System.out.printf("%d - %d = ???\n", rn1, rn2);
				correct = rn1 - rn2;
			}
			
			System.out.println("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답입니다!");
				cCount++; //정답, 오답 횟수
			} else if(answer == 0) { //종료문
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("틀렸습니다~");
				iCount++;
			}
		}
		
		System.out.println("-----------------------------------");
		System.out.println("정답 횟수: " + cCount + "회");
		System.out.println("정답 횟수: " + iCount + "회");
		
		sc.close();
	
		
				
		} 

	}


