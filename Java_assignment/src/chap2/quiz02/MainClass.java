package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Car c1 = new Car("Porsche");
		System.out.println();
		c1.setSpeed(50);
		System.out.println();
		c1.enginStart();
		c1.setMode('D');
		c1.setSpeed(100);
		System.out.println();
		c1.engineStop();
		System.out.println();
		c1.setSpeed(0);
		c1.setMode('P');
		c1.engineStop();

	}

}
