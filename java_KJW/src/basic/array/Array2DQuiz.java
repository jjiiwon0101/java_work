package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {
		
		int[][] score = {
				{79, 80, 99}, //a
				{95, 85, 89}, //b
				{90, 65, 56}, //c
				{69, 78, 77} //d
				//과목: 3과목
		};
		
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};
		
		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해보세요.
		 2. 각 과목의 평균을 출력해보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */
		//1번, 3번
		double totalAvg = 0.0;
		int idx = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		for(int[]stu : score) {
			int total = 0; //학생이 바뀔때 라는 변수로 배열 덩어리가 들어오며 0이 되야함
			//밖에 있으면 누적이 되고 안에 있으면 반복문 한번 돌때마다 0의 값을 가지게함.
			//
			for(int s : stu) {
				total += s;
			}
			double avg = (double)total / subName.length; //토탈을 과목의 길이만큼
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++;
		}
		System.out.println("----------------------------------");
		
		//2번
		for(int i=0; i<subName.length; i++) {
			int total = 0;
			for(int j=0; j<stuName.length; j++) {
				total += score[j][i];
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s 평균점수: %.1f점\n"
					, subName[i], avg);
		}
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균: %.1점\n", classAvg);
		
		
		

	}
}

	


