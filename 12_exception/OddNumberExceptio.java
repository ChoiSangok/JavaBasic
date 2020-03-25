package java12_exception;


public class OddNumberException extends RuntimeException{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "홀수맨";
	}
}
