package chap2.quiz02;

public class Car {
	
	private String model;
	private int speed;
	private char mode;
	private boolean start=false;
	
	private void enginStart(boolean start) {
		System.out.println("시동버튼을 눌렀습니다.");
		injectGasoline(speed, mode);
		injectOil();
		start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	private void injectGasoline() {
		
			System.out.println("연료가 주입됩니다.");
	}
	
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");	
	}
	
	private void moveCylinder() {
		if()
		System.out.println("실린더가 움직입니다.");
	}
	
	private void engineStop() {}

//	private public void setSpeed() {}

	public void setMode() {
		
		
	}
	

}
