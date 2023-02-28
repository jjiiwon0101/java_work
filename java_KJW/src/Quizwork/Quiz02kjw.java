package Quizwork;

import java.util.Scanner;

public class Quiz02kjw {

	public static void main(String[] args) {
		//2007년 1월 1일이 월요일일때 2007년 x월x일은 무슨 요일입니까?
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		
		int dn = 0;
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=1; i<month; i++) {
			dn += days[i];
			
			switch(dn%7) {
			case 1:
				System.out.println("mon");
				break;
			
			case 2:
				System.out.println("tue");
				break;
				
			case 3:
				System.out.println("wen");
				break;
				
			case 4:
				System.out.println("thu");
				break;
				
			case 5:
				System.out.println("fri");
				break;
				
			case 6:
				System.out.println("sat");
				break;
				
			case 7:
				System.out.println("sun");
				break;
			}
		}
		sc.close();
		
		
		
	
	
		
		
		
		
		
		

	}
}


