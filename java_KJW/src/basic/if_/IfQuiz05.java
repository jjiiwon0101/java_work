package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		 평균을 구해 보세요. (평균은 소수점 첫째 자리가지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 9 ~ 10 -> A+
		 8 ~ 7 -> A0
		 6점대는 B, 5점대는 C, 4점대는 D, 나머지는 
		 모두 F 처리하시면 됩니다. (10점 만점)
		 
		 ex)
		 평균 점수: 95.5
		 당신의 학점은 A+ 입니다.
		 */
		String grade ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		double exam1 = sc.nextDouble();
		System.out.print("영어: ");
		double exam2 = sc.nextDouble();
		System.out.print("수학: ");
		double exam3 = sc.nextDouble();
		
		double score = (exam1 + exam2 + exam3)/3.0;
		System.out.printf("평균점수는 %.1f점 입니다. \n", score);
		
//		if(score >= 60 && score <= 100) {
			if(score >= 95) {
				grade = "A+";
			} else if(score >= 90) {
				grade = "A0";
			} else if(score >= 80) {
				grade = "B";
			} else if(score >= 70) {
				grade = "C";
			} else if(score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.printf("당신의 학점은 %s 입니다.", grade);
			sc.close();
		}
}



