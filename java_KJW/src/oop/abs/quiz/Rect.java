package oop.abs.quiz;

public class Rect extends Shape {
	int i;
	
	public Rect(String name, int i) {
		super(name);
		this.i = i;
	}
	
	@Override
	public double getArea() {
		return i*i;
	}





	

}
