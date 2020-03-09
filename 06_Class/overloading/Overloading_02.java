package java06_class.overloading;

public class Overloading_02 {

	//int형 전달인자의 문자수(길이)를 구해서 반환
	
	//111222333 -> 9 
	//1234 -> 4
	
	public int getLength(int num) {
		
						
		String str=String.valueOf(num); //문자열로 반환
		
		int len=str.length();
		
		//int -> string 형변환
		//변환된 문자열의 길이를 반환

		return len;

	}
	public int getLength(boolean tf) {
		
		String str=String.valueOf(tf);
		int len=str.length();
		
		return len;
	}
	public int getLength(double dou) {
		String str=String.valueOf(dou);
		int len=str.length();
		
		return len;
		
//		return String.valueOf(dou).length();
		//한줄로 표현가능
	}
	
}
