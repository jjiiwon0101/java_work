package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
	    try {
	    	System.out.println("정수: ");
	    	int n = sc.nextInt();
	    	
	    	int result =100/n;
	    	
	    	System.out.println(arr[result]);
	    	
	    	String s = null;
	    	s.equals("메롱");
	    	
	    	
	    	
	    } catch(InputMismatchException e) {
	    	System.out.print("정수를 입력하세요!");
	    } catch (ArithmeticException e) {
			System.out.print("0을 입력하시면 안돼요~");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("인덱스 범위를 벗어났어요!");
		} catch (NullPointerException e) {
			System.out.print("null을 참조하시면 어떡해!");
		} catch (Exception e) {
			System.out.println("알 수 없는 에러가 확인됨!");
			System.out.println("에러 원인: " + e.getMessage());
		}
	    
	    System.out.println("프로그램 정상 종료!");
	    
	    sc.close();

	}

}
