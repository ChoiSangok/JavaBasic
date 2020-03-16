package java09_api.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeEx {

	public static void main(String[] args) {
		
		//Date Class ->java.util.Date
		Date dToday=new Date(); //Date 객체 생성 -> 현재 날짜/시간 입력
		System.out.println( dToday); //date 객체 출력
		
		Date dToday2=new Date( 0L ); //Date 객체 생성 -> 현재 날짜/시간 입력
		System.out.println( dToday2); //date 객체 출력
		
		//시간값을 저장하는 객체
		//시간값 저장 
		
		
		//추가 메소드 대부분이 deprecated 되어 있음
		//java. uitl. Date 클래스의 세부 정보(날짜, 시간) 를 파악하려면
		//Calendar  클래스의 get()  메소드를 사용해야 한다
		
		System.out.println("---------------------------------------");

		//Calendar Class -> java.uitl.Calendar Class
		
		Calendar cToday = Calendar.getInstance(); //Calendar 출력
		
		System.out.println(cToday); //객체 정보 전체를 출력함
		
		System.out.println(cToday.get(Calendar.YEAR)); //년도
		System.out.println(cToday.get(Calendar.MONTH)); //월
		System.out.println(cToday.get(Calendar.DATE)); //일
		
		System.out.println(cToday.get(Calendar.HOUR)); //12시 기준 시간
		System.out.println(cToday.get(Calendar.HOUR_OF_DAY)); //24시간 기준 시간
		System.out.println(cToday.get(Calendar.MINUTE)); //분
		System.out.println(cToday.get(Calendar.SECOND)); //초
		
		
		System.out.println("---------------------------------------");

		//둘의 차이점 객체생성
		
		//GregorianCalendar Class //추상메소드를 직접 구현
		GregorianCalendar gToday=new GregorianCalendar(1997,4,6,20,7,9); //자기가 원하는 날짜 직접 생성/ date나 calendar은 안된당
		
		
		System.out.println(gToday);
		
		
		System.out.println(gToday.get(Calendar.YEAR)); //년도
		System.out.println(gToday.get(Calendar.MONTH)); //월(0 :1월_
		System.out.println(gToday.get(Calendar.DATE)); //일
		
		System.out.println(gToday.get(Calendar.HOUR)); //12시 기준 시간
		System.out.println(gToday.get(Calendar.HOUR_OF_DAY)); //24시간 기준 시간
		System.out.println(gToday.get(Calendar.MINUTE)); //분
		System.out.println(gToday.get(Calendar.SECOND)); //초
		
		
		Date now=new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); //date -> calendar 적용
		
		//---------------
		
		GregorianCalendar greCal = new GregorianCalendar();
		
		greCal.setTime(now);
		
		//----------------------
		Date res1=cal.getTime(); //calendar -> date
		Date res2=greCal.getTime(); //gregoriancalendar -> date
		
		
	}
	
	

}




















