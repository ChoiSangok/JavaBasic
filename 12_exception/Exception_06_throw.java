package java12_exception;

public class Exception_06_throw {

	public static void main(String[] args) {
		
		
		//예외에 대한 정보를 담고있는 객체
//		Exception e = new NullPointerException(); //예외 객체 생성 
		NullPointerException e = new NullPointerException(); //예외 객체 생성 
		
		try {
			throw e; //예외를 직접발생시키는 문법?,,,?....?...................?...............?
		} catch (Exception e1) { //이름충ㄷ돌ㄹ나지않도록
			e1.printStackTrace();
		}
		//----------------------------------------------------
		
		
//		throw new NullPointerException(); //만들면서 던지기
	}
}
