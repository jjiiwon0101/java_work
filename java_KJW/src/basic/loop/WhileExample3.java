package basic.loop;

public class WhileExample3 {

	public static void main(String[] args) {
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력
		
		int i = 1;
		int n = 0;
		while(i <= 30000) {
			if(i % 258 == 0) {
			n++;	
			}
			i++;	
		}
		System.out.println(n + " ");
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올리면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int a = 1;
		int b = 0;
		while(a <= 1000) {
			if(1000 % a == 0) {
			b++;	
			}
			a++; 
		}
		System.out.println(b + " ");
		
		

	}

}
