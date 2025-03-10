package Ch14;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class C05ObjectMain {
	public static void main(String[] args) {
//		Date
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth() + 1);
		System.out.println(d1.getDay());// 0-6(일 -토)
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getTime());

		// Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// 요일
															// 1-7 (일-토)

		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

		// LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		DayOfWeek datOfWeek = now.getDayOfWeek();
		// 결과출력

		System.out.println("연 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		System.out.println("요일 : " + datOfWeek);

	}

}
