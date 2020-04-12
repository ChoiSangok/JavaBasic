package java15_thread;


class Thread06 extends Thread{
	
	
	@Override
	public void run() {
		method01();
	}
	
	
	public void method01() {
		method02();
	}
	
	
	public void method02() {
		method03();
	}
	
	
	
	public void method03() {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
}






public class Ex06_StackTrace {
	public static void main(String[] args) {
		
		//스레드의 스택 트레이스 확인하기
		
		new Thread06().start(); //스레드 활성화
		
		new Thread06().run(); //main 스레드를 이용한 run() 메소드 호출
		
	}
	
}











 
