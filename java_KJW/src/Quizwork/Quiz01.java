package Quizwork;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {


	public static void main(String[] args) {
		//1. 문학 영어 사회탐구1, 사회탐구 2 성적을 입력받아 총점과 평균을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		String grade;
		
		System.out.print("문학 점수: ");
		double test1 = sc.nextDouble();
	
		System.out.print("영어 점수: ");
		double test2 = sc.nextDouble();
		
		System.out.print("사회탐구1 점수: ");
		double test3 = sc.nextDouble();
		
		System.out.print("사회탐구2 점수: ");
		double test4 = sc.nextDouble();
		
		
		double score = (test1+test2+test3+test4)/4.0;
		System.out.printf("평균점수는 %.2f"+"입니다.",score);

		
		
		
		}
		
	}

		
	



