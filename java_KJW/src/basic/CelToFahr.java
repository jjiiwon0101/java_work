package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 # ㄹ 한자 7 -> (℃), ㄹ 한자 다음장 4 -> (Ｆ)
		 실수로 입력할 가능성 = 실수로 받는다.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("섭씨: ");
//System.out.println("온도를 입력하세요(℃): ");
		double cel = sc.nextDouble();
		
//      double fahr = cel * 1.8 + 32;/ 
//System.out.println("입력한 섭씨: %.1f℃\n", cel);
//System.out.printf("변환한 섭씨: %.1f℉\n", fahr);
		
		
		System.out.println("섭씨: " +(cel) + "℃");
		System.out.println("화씨: " + ((cel * 1.8) + 32) + "℉");

		sc.close();
		
		
		
	}

}
