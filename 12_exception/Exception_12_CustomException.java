package java12_exception;



public class Exception_12_CustomException {

	public static void main(String[] args) {
		
		//짝수인지 판별 객체
		CheckEven ce= new CheckEven();
		
		
		try {
			ce.check(13); //예외상황 홀수는 안돼~
		
//			ce.check(12); //정상인 상황 짝수가 맞습니다~
		} catch(OddNumberException e) {
			e.printStackTrace();
		}
		
		try {
			ce.check(12);
		}catch(OddNumberException e) {
			e.printStackTrace();
		}
		
	}

}
