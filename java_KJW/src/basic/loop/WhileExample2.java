package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
		
		int n = 48;
		while(n <= 150) {
			if(n % 8 == 0) {
			System.out.print(n + " "); //가로로 출력할때 공백도 포함시키자
			}
			n++;
			
		} 
		
		
//		int n = 48;
//		while(n <= 150) {
//			System.out.print(n + " ");
//			n += 8;
		
		System.out.println();
		
		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		int i = 1;
		while(i <= 100) {
			if(i % 4 == 0) {
				if(i % 8 != 0) {
					System.out.println(i + " ");
			}
			
		  }
		  i++; 
		
		

	     }
		
	}
}

