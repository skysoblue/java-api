package calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.omg.Messaging.SyncScopeHelper;

import grade.Grade;

/**
 * @file_name : CalendarMain.java
 * @author : coolbeat@naver.com
 * @date : 2015. 10. 6.
 * @story : Calendar 클래스
 */
public class CalendarMain {
	/**
	 * 특정일 (2015-9-14) 로 부터 오늘까지 일수 구하기 2016-02-05 에서 오늘날짜까지 남은 일수 구하기 (D-18)
	 */
	public static void main(String[] args) {
		DayCounter dc = new DayCounter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("D-day를 구하실 날짜를 year-Month-day 형식순으로 입력해주세요");
		String day = scanner.next();
		System.out.println(dc.dayTimer(day));

	}
}

class DayCounter {
	public String dayTimer(String date) {
		Calendar targetDay = Calendar.getInstance(); // 스태틱 메소드 , rt.jar 에 getInstance() 위치값(주소)를 호출
		Calendar today = Calendar.getInstance();
		
		StringTokenizer tok = new StringTokenizer(date,"-");
		String result = "";
		targetDay.set(Integer.parseInt(tok.nextToken()),
					  Integer.parseInt(tok.nextToken())-1,
					  Integer.parseInt(tok.nextToken()));  // 실제값보다 월이 1이 작다
		long targetTimes = targetDay.getTimeInMillis();
		long todayTimes = today.getTimeInMillis();
		if (targetTimes < todayTimes) {
			result = "입력하신 날짜는 이미 지난 과거의 날짜입니다.";
		} else {
			int workDays = (int) Math.ceil((targetTimes - todayTimes) / (24 * 60 * 60 * 1000));
			result = "D-" + workDays;

		}
		return result;
	}
}