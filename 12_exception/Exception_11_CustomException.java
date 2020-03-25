package java12_exception;


class User{
	private int age; //나이 멤버필드

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) throws UserAgeException{
		
		if(age<0||age>150) { //예외 상황, UserAgeException
			throw new UserAgeException(); //예외 발생시키기
		}
		this.age = age;
	}
	
	
}

//사용자 정의 예외 클래스

//class UserAgeException extends Exception{ //checked
	
class UserAgeException extends RuntimeException{ //unchecked
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "나이는 0보다 작거나 150 보다 클 수 없다";
	}
	
	
	
}



public class Exception_11_CustomException {

	public static void main(String[] args) {
		
		
//		throw new UserAgeException();
		
		User user=new User();
		
//		try {
//			user.setAge(-5);
//			
//		} catch (UserAgeException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
	
		user.setAge(-5);

		
	}
}





//
//+ 사용자 정의 예의 만들기
//
//- API Exception 클래스들 이외에 추가적으로 예외 상황을 정의하는
// 클래스를 만드는 것
//
//- 개발자가 직접 예외 상황을 설정하고 클래스로 구분하는 것
//
//- Exception 클래스, RuntimeException 클래스를 상속받아 구현한다
//  (Checked)		(Unchecked)
//
//		ex) class UserException extends Exception {
//			
//			
//		    }
//

