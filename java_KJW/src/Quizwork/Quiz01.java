package Quizwork;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {


	public static void main(String[] args) {
		//이름 입력하는 문제
		Scanner sc = new Scanner(System.in);
		String [] names = new String[6];
		
		for(int i = 0; i<names.length; i++) {
			System.out.print("이름을 입력하세요: ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
				
			}
			names[i]=name;
		}
		System.out.println("입력받은 네임: ");
		for(String n : names) {
			if(n == null) break;
			System.out.println(n + " ");
				
			}
		}
		
	}

		
	



