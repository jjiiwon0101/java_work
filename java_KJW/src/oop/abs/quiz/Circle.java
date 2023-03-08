package oop.abs.quiz;

public class Circle extends Shape{
	int i;
	
	public Circle(String name, int i) {
		super(name);
		this.i = i;
	}

	@Override
	public double getArea() {
		return i*i*3.14;
	}
	
	

	
	
	
	

}
