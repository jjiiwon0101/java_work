package chap2.quiz02;

public class Car {
	
	private String model;
	private int speed;
	private char mode;
	private boolean start=false;
	
	public Car(String model) {
		System.out.println("모델명: " + model);
	}
	
    
	
	
	
	void setSpeed(int speed) {
		if(speed<0||speed>=200) {
			System.out.println("속도는 0 미만, 200 이상일 수 없습니다");
			return;//
		} else if(start==false) {
			System.out.println("시동이 걸려있지 않습니다.");
			return;
		} else if(mode != 'D' && mode != 'R') {
			System.out.println("D나 R모드가 아니라면 속도를 지정할 수 없습니다.");
			return;
		} else if(mode=='R') {
			if(speed>40) {
				System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
				return;	
			}
		}
		this.speed=speed;
	}
	
	void setMode(char mode) {
		if(mode=='R') {
			System.out.println("후진합니다.");
			this.mode='R';
		} else if(mode=='D') {
			System.out.println("주행합니다.");
			this.mode='D';
		} else if(mode=='N') {
			System.out.println("중립모드로 전환합니다.");
			this.mode='N';
		} else {
			System.out.println("주차모드입니다.");
			this.mode='P';
		} 
	}
	
	
	//시동 버튼 누르는 행위
	void enginStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		injectGasoline(speed, mode);
		injectOil();
		start = true;
		moveCylinder(start);
		System.out.println("시동이 걸렸습니다.");
	}
	//엔진에 연료가 주입되는 기능
   private void injectGasoline(int speed, char mode) {
			System.out.println("연료가 주입됩니다.");
	}
	
   //엔진오일이 주입되는 기능
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");	
	}
	
	//
	private void moveCylinder(boolean start) {
		if(start) {
			System.out.println("실린더가 움직입니다.");			
		} else if(start) {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	//시동을 끄는 기능
	void engineStop() {
		if(speed>0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		}
		if(speed==0) {
			
		}
		if(mode != 'P') {
			System.out.println("P모드로 먼저 변속기를 변경하세요.");
			return;
		} else {
			start = false; 
			System.out.println("시동이 꺼졌습니다.");
		}
		
			
	}// 엔진 스탑

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public void setMode() {	
		
	}

	public void setSpeed() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	

	
