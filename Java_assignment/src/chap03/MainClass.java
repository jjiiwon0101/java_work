package chap03;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart c = new MyCart(2100);
		
		
		
		c.buy(new Tv());
		c.buy(new Radio());
		c.buy(new Computer());

	}

}
