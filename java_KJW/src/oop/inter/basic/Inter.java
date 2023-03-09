package oop.inter.basic;

//인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할.
public interface Inter extends ParentInter{ 
	
	//인터페이스에서 변수를 선언하면 상수(static final)로 지정됩니다.
	int N = 5;
	
//	Inter() {
//		인터페이스는 생성자를 가질 수 없습니다. (객체화 될 수 없는 개념입니다.)
//	} 객체 선언을 해도 상수로 인식한다.
	//인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다. 껍데기만 구현
	//데이터를 저장할 필요는 없다.
	void method1();
	
	public static void staticMethod() {
		System.out.println("가능합니다~");
	}


	void parentMethod();

}
