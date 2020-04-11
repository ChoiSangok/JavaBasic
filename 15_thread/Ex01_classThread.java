package java15_thread;




// 일반 클래스스레드 클래스
class Thread01 extends Thread{
	@Override
	public void run() { //스레드 코드

		for(int i = 1;i <= 100; i++) {
			System.out.println("Thread : " + i);
			
			try {
				Thread.sleep(50); //스레드를 50 밀리초 일시정지 시킨다 
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}




public class Ex01_classThread {

	public static void main(String[] args) {
		
		Thread01 th01 = new Thread01(); //객체생성
		
//		th01.run(); //일반 메소드 호출, 하지말 것, 스레드 아님!
		
		th01.start(); //스레드 실행, 활성화**************스레드 활성화
		
		for(int i = 1;i <= 100; i++) {
			System.out.println("Main: "+i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	//스레드 제어 메소드
	// 스레드의 동작을 제어하는 메소드
	// 스레드 생명주기( 라이프사이클, life cycle )에 영향을 준다
	
	// public static void sleep(long millis) throws InterruptedException
	// 주어진 밀리초만큼 sleep을 호출한 스레드를 일시정지 시킨다
	// 
	
}




