package java15_thread;

import java.util.Random;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Ex04_Join extends Thread{

	private int idx; //스레드 인덱스 사용
	
	public Ex04_Join(int idx) {
		this.idx=idx;
				
	}
	
	@Override
	public void run() {
		
		System.out.println("idx : "+"스레드 실행");
		
		Random ran = new Random();
		
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(idx+" 스레드 끝");
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("메인스레드입니다");
		
		Ex04_Join t1= new Ex04_Join(1);
		Ex04_Join t2= new Ex04_Join(2);
		Ex04_Join t3= new Ex04_Join(3);

		t1.start();
		t2.start();
		t3.start();
		
		try {
			
			//public final void join() throws InterruptedException
			// 스레드가 종료될 때까지 기다린다
			
			
			
			t1.join(); //호출한 스레드가 영향을 받아 main이 기다림
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 끝");
		
	}
}

















