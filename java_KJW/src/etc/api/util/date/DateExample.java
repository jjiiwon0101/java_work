package etc.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);//객체생성 //1ang
		
		System.out.println("0------------------------0");
		
		//현재 날짜 정보 얻기 (연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//현재 시간 정보 얻기 (시,분)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//현재 날짜와 시간 정보 얻기 (연,월,일,시,분,초)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate
		             = LocalDateTime.of(2022,7, 1, 9, 0, 0);
		System.out.println(beginDate);
		
		//연도 추출
		int year = localDateTime.getYear();
		System.out.println("year: " + year);
		
		int monthValue = localDateTime.getMonthValue();
		System.out.println(monthValue);
		
		 Month month = localDateTime.getMonth();
		System.out.println(month);

	}

}