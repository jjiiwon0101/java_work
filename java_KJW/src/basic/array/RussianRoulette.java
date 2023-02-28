package basic.array;

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
	
		
		int i;
		for(i=0; i<number1; i++) {
			System.out.println("플레이어" + i + ":");
			String name = sc.next();
		}
		String names[] = new String[i];
		
		
		
		//실탄 개수 입력 (1미만 5 초과 안됨)
		System.out.println("실탄 개수를 입력해주세요(1~5): ");
		int bullet = sc.nextInt();
		
		System.out.println("플레이어: " + number1 + "명");
		System.out.println("총알: " + bullet + "개");
		System.out.println("플레이어 목록\n" + Arrays.toString(names));
		
		//실탄을 탄창에 배치합니다.
		//실행 순서 정하기
		//난수를 이용하여 실행 순서를 정합니다.
		
		//시작 인덱스를 난수를 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.
		//일부러 입력대기를 해서 흐름을 잠시 끊어줍니다.

		boolean[] bulletPos = new boolean[6];
		int gun = (int) (Math.random()*2 + 1);
		int shoot = (int) (Math.random()*5 + 1);
		boolean flag = false;	
		
		while (true) {
			outer:
			
				
			for(int r = 0; r<count; r++) {
				if(true == bulletPos[r]) {
					r--;
					continue outer;
				}
			}
			if(bullet == 1) { 
				
				bulletPos[i] = true;
				break;
			}
		}
		
		
		//이 입력값(enter)는 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
		 
		 
		sc.nextLine(); //흐름 끊기 전에 적당한 위치에 
		
		
		
		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
		for(i=0; i<names.length; i++) {
			
		}
		

	}

}
