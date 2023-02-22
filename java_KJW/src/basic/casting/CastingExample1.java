package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		/*
		 - 크기가 작은 타입의 자료를 큰 데이터 타입으로 변환할때는
		 자바 가상 머신 (JVM)이 자동으로 타입을 올려서 번환해줍니다.
		 (promotion, UpCasting)
		 */
		
		byte b = 10;
		int i = b;
		System.out.println(i);

	}

}
