package chap2.quiz01.copy;

public class Student extends Person{
	
	@Override
	void PersonInfo() {
		super.PersonInfo();
		System.out.println(" #학번: " + studentId);
	}

	String studentId = "a001";

}
