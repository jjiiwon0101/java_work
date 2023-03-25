package chap2.quiz01.copy;

public class MainClass {
	
	public static void main(String[] args) {
		
	 Student s1 = new Student();
	 s1.name = "홍길동";
	 s1.age = 30;
	 s1.PersonInfo();
	 
	 Teacher t1 = new Teacher();
	 t1.name = "김철수";
	 t1.age = 50;
	 t1.PersonInfo();
	 
	 Employee e1 = new Employee();
	 e1.name = "박영희";
	 e1.age = 25;
	 e1.PersonInfo();

	}

}
