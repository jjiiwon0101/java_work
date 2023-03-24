package chap2.quiz01.copy;

public class Employee extends Person{

	@Override
	void PersonInfo() {
		super.PersonInfo();
		System.out.println(" #부서: " + department);
		
	}
	
	String department = "영업부";
	
	

	
	

}
