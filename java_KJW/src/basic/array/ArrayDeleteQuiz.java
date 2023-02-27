package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] bt21 = {"알제이", "슈키", "코야", "망이", "치미", "타타", "쿠키"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(bt21));
		System.out.print("삭제를 원하는 친구를 입력하세요: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해주세요.
		 2. 만약 입력받은 이름이 없다면 없다고 얘기해주세요.
		 */
		boolean flag = false; //boolean타입의 기본값이 false
		for(int i=0; i<bt21.length-1; i++) {
			if(name.equals(bt21[i])) {
				flag = true;
				for(int j=i; j<bt21.length-1; j++) {
					bt21[j]=bt21[j+1];
				}
				break;
			}
			
		}
		if(!flag) {
			System.out.println(name + "(은)는 없는 이름입니다.");
		} else {
			String [] friend = new String[bt21.length-1];//맨뒤는 더이상 못끌어옴
			for(int j=0; j<bt21.length-1; j++) {
			friend[j] = bt21[j];
			
		}
			bt21 = friend;
			friend = null;
		
			System.out.println("삭제 후 정보: " + Arrays.toString(bt21));
			
		    
		    }
				
		sc.close();
		}
	}


