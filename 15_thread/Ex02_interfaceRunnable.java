package java15_thread;


//runnable 클래스
class Thread02 implements Runnable{ //Runnable 사용하느게 좋음

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
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

public class Ex02_interfaceRunnable {

	public static void main(String[] args) {
		
		Thread02 th02 = new Thread02();
		
		//thread 클래스에 Runnable 클래스를 전달하며 객체를 생성한다
		Thread threadExecutor = new Thread( th02 );
		
		threadExecutor.start(); //스레드 실행, 활성화
		
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

}
