package oop.modi.membet.pac1;

public class A {
	
	public int x;
	int y; //dufault
	private int z;
	
	public A() {
		
		x = 1;
		y = 2;
		z = 3;
		
		this.method1(); //this 생략됨.
		method2();
		method3();
	}
	
	public void method1() {}
	void method2( ) {}
	private void method3() {}

}
