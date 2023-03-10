package oop.obj_arr;

public class Score {
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	private String name; //객체 생성
	private int korean;
	private int english;
	private int math;
	private int sc;
	private double av;
	
	
    public Score() { //메서드 생성
	}
    
	public void score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	} //메서드 생성 후 객체에 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSc() {
		return sc;
	}

	public void setSc(int sc) {
		this.sc = sc;
	}

	public double getAv() {
		return av;
	}

	public void setAv(double av) {
		this.av = av;
	}

	public void scoreInfo() {
		System.out.println();
		System.out.println("학생의 이름: " + name);
		System.out.println("국어점수: " + korean);
		System.out.println("영어점수: " + english);
		System.out.println("수학점수: " + math);
		System.out.println("총점:  " + (korean+english+math));
		System.out.println("평균점수:" + (double)(korean+english+math)/3);	
	}

	
		
	}


