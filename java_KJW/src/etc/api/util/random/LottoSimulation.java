package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulation {
	
	static Random r = new Random();
	
	static int prize1 = 0;
	static int prize2 = 0;
	static int prize3 = 0;
	static int prize4 = 0;
	static int prize5 = 0;
	static int failCnt = 0;
	
	public static Set<Integer> createLotto() {
		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		 컬렉션 자료형에 모아서 리턴해 주세요.
		 무엇을 쓰든 상관하지 않겠습니다.
		 중복이 발생하면 안됩니다.
		 */
		
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45)+1);
			
		}
		return lotto;
		
	}
	
	//보너스 번호 생성하는 메서드
	/*
	 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
	 당첨 번호들을 피해서 보너스번호 하나만 뽑아 주세요.
	 범위은 마찬가지로 1~45 사이의 난수입니다.
     */
	
	public static int createBonusNum(Set<Integer> Bonusnum) {
		int bos;
		while(true) {
			bos = r.nextInt(45)+1;
			for(int r : Bonusnum) {
				 if(r==bos) {
					 continue;
				 }
			}
			break;
		}
		return bos;
		
		
	}
	
	//당첨 등수 알려주는 메서드
	/*
	매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스 번호를 받습니다.
	내 로또 번호와 당첨 번호를 비교하여
	일치하는 횟수를 세 주신 후 등수를 판단하세요.
	판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
	6개 일치-> 1등
	5개 일치 + 보너스번호 일치 -> 2등
	5개 일치 -> 3등
	4개 일치 -> 4등
	3개 일치 -> 5등
	나머지 -> 꽝
 */
	public static void checkLottoNumber(
			List<Integer> random, Set<Integer> mylotto, int number) {
		int count=0;
		for(int i=0; i<6; i++) {
			if(mylotto.contains(random.get(i))) {
				count++;
			}
		}
		
		if(count==6) {
			prize1++;
		} else if(count==5) {
			if(mylotto.contains(number)) {
				prize2++;
			} else {
				prize3++;
			}
		} else if(count==4) {
			prize4++;
		} else if(count==3) {
			prize3++;
		} else {
			failCnt++;
		}
		
	}
	
	
	public static void main(String[] args) {
		//로또 번호 생성 메서드를 호출해서 당첨번호를 하나 고정시키세요.
		Set<Integer> lotto = createLotto();
		List<Integer> lottoList = new ArrayList<>(lotto);
		
		//보너스 번호도 하나 고정시키세요.
		int Bonusnum = createBonusNum(lotto);
		
		int count=0;
		long money=0L;

		while(true) {
			/*
		    - 1등이 당첨 될 때까지 반복문을 돌립니다.
		    - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
		    반복문을 종료합니다.
		    - 로또를 구매하기 위한 금액도 출력하세요. (long)
		     */
			Set<Integer> mylotto = createLotto();
			money+=1000L;
			count++;
			
			checkLottoNumber(lottoList, mylotto, Bonusnum);
			System.out.printf("로또를 %d번째 구매했습니다\n", count);
			
			if(prize1==1) {break;}
		}
		System.out.println("------------------------------");
		System.out.println("!!!1등 당첨!!!");
		System.out.println( count + "번째에 1등 당첨됐습니다.");
		System.out.println("2등 당첨 횟수: " + prize2);
		System.out.println("3등 당첨 횟수: " + prize3);
		System.out.println("4등 당첨 횟수: " + prize4);
		System.out.println("5등 당첨 횟수: " + prize5);
		System.out.println("꼴등 횟수: " + failCnt);
		System.out.println("여태까지 사용한 금액: " + money + "원");
	

	} 

}
