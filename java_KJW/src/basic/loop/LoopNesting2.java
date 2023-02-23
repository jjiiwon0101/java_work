package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int count = 0; //소수의 개수를 세 줄 변수.
		
		System.out.print("소수: ");
		for(int x=1; x<=num; x++) {
			int cnt = 0; //반드시 여기에 있어야함(한바퀴마다 새로)
			for(int y=1; y<=x; y++) {
				if(x % y == 0) {
					cnt++;
					
				}
			}
			if(cnt == 2) {
				System.out.print(x + " ");
				count++;
			
				
			}
		}
		System.out.println();
		System.out.printf("소수의 개수: %d개", count);
		sc.close();

	}

}
