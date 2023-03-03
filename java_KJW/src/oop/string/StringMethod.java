package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		
		
		//charAt(index): 문자열 인덱스에 따른 단일 문자 반환.string 메서드
		char c = str.charAt(4); //리턴 타입이 char
		System.out.println("4번 인덱스의 값: " + c);
		
		//substring(begin, end)
		//:  문자열을 범위 지정하여 추출 ->자주 쓰인다.
		String ss1 = str.substring(1, 5); //1번 이상 5번 미만
		System.out.println("ss1: " + ss1);
		
		String ss2 = str.substring(6); //6번부터 끝까지
		System.out.println("ss2: " + ss2);
		
		//length() : 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len: " + len);
		
		//indexOf(str): 해당 문자가 있는 인덱스를 반환
		//해당 문자가 존재하지 않으면 -1을 리턴
		int idx1 = str.indexOf("l");
		System.out.println("idx1: " + idx1);
		
		//뒤에 있는 단어도 출력하게 하고싶다
		int idx2 = str.lastIndexOf("l");
		System.out.println("idx2: " + idx2);
		
		//여러 문자열을 전달하면 시작 인덱스를 알려줍니다.
		int idx3 = str.lastIndexOf("java");
		System.out.println("idx3: " + idx3);
		
		//일괄 대 소문자 변경
		String str2 = "HeLLo WoRLd";
		String lower = str2.toLowerCase();
		System.out.println("lower: " + lower);
		
		//일괄 소문자 변경, string 변수 입력해서 받아주면 됨.
		String upper = str2.toUpperCase(); 
		System.out.println("upper: " + upper);
		
		
		//trim(): 문자열의 앞, 뒤 공백을 제거
		String name = "                전정국               ";
		System.out.println(name.trim()+ "님 안녕하세요~!");
		
		
		//replace(old, new)
		//기존 문자열 내부에 old값을 모두 찾아서 new 문자열로 일괄 변경.
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "Java"));
		System.out.println(java.replace("습니", ""));
		//없어지는거와 같은 효과
		
		//split: 문자열을 구분자로 구분하여 분할.
		//분할된 문자들은 String 배열에 담아서 리턴.
		String phone = "010-1234-5678";
		String[] numbers = phone.split("-");
		System.out.println(Arrays.toString(numbers));
		
		String pet= "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(",");
		System.out.println(Arrays.toString(pets));
		
		System.out.println("-------------------------------");
		
		//문자열의 정수 변환
		String s1 = "100";
		String s2 = "3.14";
		
		int i = Integer.parseInt(s1);//문자열 -> 정수
		double d = Double.parseDouble(s2);//문자열 -> 실수
		System.out.println(i+d);
		
		//valueOf: 기본 타입을 문자열로 변경
	    System.out.println(3+4);
	    System.out.println(String.valueOf(3) + String.valueOf(4));
	

	}

}
