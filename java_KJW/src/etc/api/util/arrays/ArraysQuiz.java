package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {
	
	

	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정합니다.
        전체선수: "홍길동", "김길동", "김철수", "최철수", "빅영희"
        통과한 선수: "홍길동", "김길동", "박영희", "김철수"
        */
		//반복문의 기준을 작은 숫자로 지정.
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		//참자가 배열이랑 완주자 배열 정렬
		
		int i; //변수 i 선언
		for(i=0; i<completion.length; i++) {
			//완주자 배열 한명씩 세어줌. 짧은 배열을 기준으로 잡아줌.
		 if(!(participant[i].equals(completion[i]))) {
			//참가자와 완주자의 배열을 하나씩 비교해서 둘이 같지 않을 경우를 if문에 추가.
			//문자열이니 equals로 같다는 것을 표현, 논리 반전 연산자.
			return participant[i];
			//참가자의 i번째 인덱스에 없다는것 값을 올려줌.
		}
		 }
			
		return null;
		//없다면 리턴해주는 배열이 빈칸이라는 걸 나타내줌.
	
		
	}

	public static void main(String[] args) {
		
		String[] paricipant= {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion= {"홍길동", "김길동", "박영희", "김철수"};
		//참가자와 완주자의 배열들 선언
		
		
		System.out.println("완주하지 못한 자: " + solution(paricipant, completion));
		
		
		
		

	}

}
