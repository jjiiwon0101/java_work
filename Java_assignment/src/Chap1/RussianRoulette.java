package Chap1;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
	
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		//게임 인원 입력
		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 참가자의 명수와 동일합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 인원 2~4명 중 입력하세요: ");
		System.out.println("--> ");
		int number1 = sc.nextInt();	
		
		int count=0;
		String[] name = new String[number1];
	
		
		
		for(int i=0; i<number1; i++) {
			System.out.println("플레이어" + (i+1) + ":");
			name[i] = sc.next();
		}
		
		
		
		//실탄 개수 입력 (1미만 5 초과 안됨)
		System.out.println("실탄 개수를 입력해주세요(1~5): ");
		int bullet = sc.nextInt();
		
		boolean b6[] = new boolean[6];
		
		System.out.println(Arrays.toString(b6));
		System.out.println("플레이어: " + number1 + "명");
		System.out.println("총알: " + bullet + "개");
		System.out.println("플레이어 목록\n" + Arrays.toString(name));
		
		//실탄을 탄창에 배치합니다.
		//실행 순서 정하기
		//난수를 이용하여 실행 순서를 정합니다.
		
		//시작 인덱스를 난수를 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.
		//일부러 입력대기를 해서 흐름을 잠시 끊어줍니다.

		boolean[] bulletPos = new boolean[6];
		int gun = (int) (Math.random()*2 + 1);
		boolean flag = false;	
		
		while (true) {//총알의 위치 랜덤설정
			int shoot = (int) (Math.random()*6); //0~5
			if(bulletPos[shoot] == true) {
				continue;
			} else {
				bulletPos[shoot] = true;
				count++;
			}
			
			if(bullet == count) break;
			
		}
		
		
		System.out.println(Arrays.toString(bulletPos)); //총알이어디있나?
		//이 입력값(enter)는 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
		 
		 
		sc.nextLine(); //흐름 끊기 전에 적당한 위치에 
		
		
		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.

		int r = 0;
		int person = (int) (Math.random()*number1);//누구부터 시작할거냐
		while(true) {
			
			//랜덤으로 뽑은 사람부터 시작. 인덱스 활용.
			System.out.println(name[person] + "부터 시작합니다.");
			System.out.println("엔터를 누르면 격발합니다!");
		   sc.nextLine();
			
			//엔터를 누르면 총이 격발됩니다. <<출력하기. 
			
			
			
			//만일 true라면 죽고 false라면 무사히 넘어감.
			if(bulletPos[r]==true) {
				System.out.println("사망하셨습니다.");
				bullet--;
				number1--;
				
				for(int i=person; i<name.length-1; i++) {
					name[i]=name[i+1];
				}
				String[]temp = new String [name.length-1];
				
				for(int i=0; i<name.length-1; i++) {
					temp[i]=name[i];
				}
				name=temp;
				temp=null;
				if(bullet==0) {
					System.out.println("게임 끝났습니다.");
					break;
				} else if(number1==1) {
					System.out.println("게임 끝낫습니다.");
					break;
				}
				
			} else {
				System.out.println("당신은 생존하셨습니다.");
				person++;
			}
		   if(number1 == person) {
			   person=0;
		   }
			r++;
			
			// 만일 사람이 한명만 남는다면 break;
			// 만일 총알이 다 떨어진다면 break;
			
			//N번째 사람이 총을쏜다.
			// 살았나? 죽었나?
			
			//총알이 있었나?
			
			//총알이 없었나?
			
			//1명이 남았는가? 
			//생존여부에 상관X 다음사람,다음탄창 (++)
			
			
			
			
			
			
		}
		
		System.out.println("생존자: "+Arrays.toString(name));
		//남은 플레이어 목록 출력하고 게임이 종료되었습니다. 
//		sc.close();


	}

}
