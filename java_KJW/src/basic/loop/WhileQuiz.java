package basic.loop;

public class WhileQuiz {

	public static void main(String[] args) {
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력
		
		int i = 1; //begin
		int n = 0; //개수를 기억할 변수
		while(i <= 30000) { //end
			if(i % 258 == 0) {
			n++;	
			}
			i++; //step (반복문이든 아니든 끝을 향해 달려가는거라 if문 안에 넣으면 
			//안됨.)
		}
		System.out.println("배수의 개수: " + n);
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올리면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int a = 1; //begin
		int b = 0; //개수를 기억할 변수
		while(a <= 1000) { //end
			if(1000 % a == 0) {
				b++;	
			}
			a++;  //step
		}
		System.out.println("약수의 개수: " + b);
	//	System.out.printf("1000의 약수의 개수: %d개\n", b);
		
		

	}

}
