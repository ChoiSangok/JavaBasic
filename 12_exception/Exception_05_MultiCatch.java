package java12_exception;

public class Exception_05_MultiCatch {

	public static void main(String[] args) {
		
		try {
			
		} catch (NullPointerException 
				| ArithmeticException 
				| ArrayIndexOutOfBoundsException e) { // 두 개 한번에 올류
			
			System.out.println("예외가 발생했음");
			// TODO: handle exception
		} catch( Exception e) {
			
			
		}
		
		
	}

}
