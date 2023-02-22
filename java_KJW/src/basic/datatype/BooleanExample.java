package basic.datatype;

public class BooleanExample {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할때는
		 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		 (promotion, UpCasting)
		 */
		
		boolean b1 = true;
		boolean b2 = false;
		
//		boolean b3 = True; (x)
//		boolean b4 = False; (x)
//		boolean b5 = 0; (x)
//		boolean b6 = "논리형 타입"; (x)
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자번호:" + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);

	}

}
