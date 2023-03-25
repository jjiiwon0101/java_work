package chap2.quiz01.copy;

public class Teacher extends Person{

	@Override
	void PersonInfo() {
		super.PersonInfo();
		System.out.println(" #과목: " + subject);
	}
	String subject = "수학";
	
	

}
