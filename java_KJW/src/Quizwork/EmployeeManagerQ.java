package Quizwork;

import java.util.Scanner;

public class EmployeeManagerQ {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100]; //사번
		String[] names = new String[100]; //사원이름
		int[] ages = new int[100]; //사원나이
		String[] departments = new String[100]; //사원부서

		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		//무한루프
		init: 
			while(true) {
				System.out.println("\n==========사원정보프로그램=============");
				System.out.println("# 1. 사원정보 신규 등록");
				System.out.println("# 2. 모든 사원 정보 보기");
				System.out.println("# 3. 사원 정보 검색");
				System.out.println("# 4. 사원 정보 수정");
				System.out.println("# 5. 사원 정보 삭제");
				System.out.println("# 6. 프로그램 종료");
				System.out.println("=====================================");
				
				System.out.println("> ");
				int menu = sc.nextInt();
				
				if(menu==1) {
					System.out.println("# 사원 정보 등록을 시작합니다.");
					System.out.println("사원 사번: ");
					String empnum = sc.next();
					
					while(true) {
						boolean flag = false;
						for(int i=0; i<count; i++) {
							if(empnum.equals(userNums[i])) {
								System.out.println("이미 입력된 사번입니다.");
								flag = true;
								break;
							}
						}
						if(!flag) {
							userNums[count] = empnum;
							break;
						} else {
							System.out.println("사번 재입력");
							empnum=sc.next();
						}
					}
					System.out.println("- 이름: ");
					names[count]=sc.next();
					System.out.println("- 나이: ");
					names[count]=sc.next();
					System.out.println("- 부서명: ");
					names[count]=sc.next();
					
					System.out.println(names[count] + "님의 정보가 정상적으로 등록되었습니다.");
					count++;
				}
			}
			
			
}
}

