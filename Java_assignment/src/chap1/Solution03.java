package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		/*
		 * 문제:
	scores 배열에 존재하는 점수에 순위를 매겨서 출력하는 프로그램 입니다.

입력: 
	Scanner를 활용하여 총 5개의 점수를 입력받습니다.
	타입은 정수 타입이며 scores 배열에 순서대로 삽입합니다.
	점수의 순서는 정해진 것이 없습니다만 중복은 허용하지 않는다고 가정합니다.
	ex) 85 100 35 47 90 
	
출력:
	ex) 
	점수    		순위
	--------------------------
	85		3
	100		1
	35		5
	47		4
	90		2
	
	의 형태로 출력합니다. 점수와 순위의 간격은 적절하게 띄워 주시면 되겠습
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] score1 = new int[5];
		
		 
		
		for(int i=0; i<score1.length; i++) {
			System.out.print((i+1) + "번째 점수를 입력하세요: ");
			score1[i] = sc.nextInt();		
		}
		
		int[] ranking = new int[5];
		for(int i=0; i<score1.length; i++) {
			int count = 1;
			
			
			for(int j=0; j<score1.length; j++) {
				if(score1[i] < score1[j]) count++; {
					
				}
				ranking[i] = count;
				
			}
			
			System.out.println("\n점수\t순위");
			System.out.println("-----------------------------");
			
		}
		for(int i=0; i<score1.length; i++) {
			System.out.printf("%d\t %d위 \n", score1[i], ranking[i]);
		}

		sc.close();
	}

}
