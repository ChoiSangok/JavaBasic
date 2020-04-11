package java15_thread;

import java.util.Random;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Ex03_ThreadTest extends Thread{

	private int idx; //스레드 인덱스 사용
	
	public Ex03_ThreadTest(int idx) {
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
		
		for(int i=0;i<10;i++) {
			new Ex03_ThreadTest(i).start();
		}
		System.out.println("메인 스레드 끝");
		
	}
}
