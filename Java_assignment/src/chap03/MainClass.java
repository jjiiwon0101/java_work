package chap03;

public class MainClass {

	public static void main(String[] args) {
		
        MyCart c = new MyCart(2100);
		
		Tv tv = new Tv();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		c.buy(new Tv());
		c.buy(new Radio());
		c.buy(new Computer());

	}

}
