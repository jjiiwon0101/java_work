package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

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
				System.out.println("\n========== 사원 관리 프로그램=========="+count);
				System.out.println("# 1. 사원 정보 신규 등록");
				System.out.println("# 2. 모든 사원 정보 보기");
				System.out.println("# 3. 사원 정보 검색");
				System.out.println("# 4. 사원 정보 수정");
				System.out.println("# 5. 사원 정보 삭제");
				System.out.println("# 6. 프로그램 종료");
				System.out.println("=======================================");

				System.out.print("> ");
				int menu = sc.nextInt();

				if(menu==1) {
					System.out.print("사원의 사번: ");
					String num = sc.next();

					for(int i=0; i<count; i++) {
						if(num.equals(userNums[i])) {
							System.out.println("이미 존재하는 사번입니다. 시작메뉴로 돌아갑니다.");
							continue init;
						} 
					}
					userNums[count]=num;
					System.out.print("사원의 이름: ");
					String name = sc.next();
					names[count] = name;

					System.out.print("사원의 나이: ");
					int age = sc.nextInt();
					ages[count]=age;

					System.out.print("사원의 부서: ");
					String depart = sc.next();
					departments[count]=depart;

					count++;
					//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
					//사번은 중복되면 안됩니다.
					//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)	

				}else if(menu==2) {

					if(count == 0) {
						System.out.println("등록된 사원 정보가 없습니다.");

					} else {
						for(int i=0;i<count;i++) {
							System.out.printf("사번: %s",userNums[i]);
							System.out.printf("이름: %d",names[i]);
							System.out.printf("나이: %s",ages[i]);
							System.out.printf("부서: %d",departments[i]);
						}
					}


					//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
					//만약 사용자가 사원 등록을 한 명도 하지 않았다면
					//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.

				}else if(menu==3) {
					System.out.println("사번을 입력하세요: ");
					String num2 = sc.next();

					for(int i=0; i<count; i++) {
						if(i==count) {
							System.out.println();

							System.out.println("사원목록: ");
							System.out.println("사번: " + userNums[i]);
							System.out.println("이름: " + names[i]);
						}
					}
					int i =0;
					if(i==count) {
						System.out.println("조회하신 사원의 정보가 없습니다.");
					}

					//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
					//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.


				} else if(menu==4) {
					//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
					//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
					//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
					//사번이 존재하지 않는다면 없다고 얘기해 주세요.

					boolean flag = false;
					System.out.print("사번을 입력하세요: ");
					String num3 = sc.next();


					for(int i=0; i<count; i++) {
						if(userNums[i].equals(num3)) {
							flag = true;
							System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]");
							int change = sc.nextInt();
							if(change==1) {
								System.out.println("나이를 변경: ");
								int age = sc.nextInt();
								ages[i] = age;
								System.out.println("나이 변경 완료!");
							} else if(change == 2) {
								System.out.println("부서 변경: ");
								String department = sc.next();
								departments[i] = department;
								System.out.println("부서 변경 성공!");
							} else if(change == 3) {
								System.out.println("취소");
							}

						}
					}
					
					if(!flag) {
						System.out.println("입력하신 사원 정보는 없습니다.");
					}

				} else if(menu==5) {
					
					boolean flag5 = false;
					boolean flagw = true;
					
					System.out.println("삭제하려는 사원의 사번을 입력하세요. ");
					System.out.print("> ");
					String num4 = sc.next();
					
					for(i=0; i<count; i++) {
						if(num4.equals(userNums[i])) {
							flag5 = true;
							break;
						}
					}
					if(flag5) {
						System.out.printf("사번 %s의 정보입니다.", userNums[i]);
						System.out.printf("\n 이름: %s.", names[i]);
						System.out.printf("\n 나이: %d.", ages[i]);
						System.out.printf("\n 부서: %s.", departments[i]);
					}
						





					//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
					//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
					//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
					//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
					//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				} else if(menu==6) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break; //while true break 사용자가 6번을 입력할때 종료
				} else {
					System.out.println("메뉴를 잘못 입력하셨습니다.");
				}

			} //end 바깥쪽 while true


	}
}
