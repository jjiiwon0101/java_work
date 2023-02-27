package basic.array;

import java.util.Arrays;

public class ArraryDelete {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		//7이란 값을 삭제하고 싶다 가정하면 4번 인덱스의 값을 3번에 밀어온다.
		//1, 3, 5, 7, 9, 9, 11, 13, 중복된건 신경 안써도 됨.
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		//배열의 크기가 클때는 반복문
		
		//삭제되는 값을 기준으로 뒤에 있는 값을 한칸씩 앞으로 땡기는 작업.
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 대입하려고 하는 작업.
		for(int i=3; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		
		//기존의 배열보다 크기가 하나 작은 새 배열을 생성
		int[] temp = new int[arr.length-1];//기존 배열보다 크기가 하나 작으면됨
		
		//원번 배여의 값을 새 배열에 인덱스에 맞춰서 그대로 대입하기
//		temp[0]=arr[0];
//		temp[1]=arr[1];
//		temp[2]=arr[2];		
		
		for(int j=0; j<temp.length; j++) {
			temp[j]=arr[j];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		arr = temp; //temp 배열의 주소값을 arr에게 넘긴다.
		temp = null;// 주소값을 지워서 메모리에 temp는 자동 소멸되게 합니다.
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
