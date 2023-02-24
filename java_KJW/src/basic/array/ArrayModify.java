package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		//[배열의 수정]
		String [] foods = {"삼겹살", "물회", "곱창", "바지락칼국수"};
		System.out.println(Arrays.toString(foods));
		//-> 수정
		foods [0] = "탕수육";
		foods [1] = "녹차티라미수";
		
		
		//배열의 인덱스 탐색
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택한 음식을 입력하세요: ");
		String name = sc.next();
		
		for(int i=0; i<=foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스" + i + "번");
				break;
				
			}
			else if(i == foods.length-1) {
				System.out.println("없는 음식입니다.");
			}
		} 
		
		
		
		}
		
		
		
//		if(name==foods[i])
		

	}


