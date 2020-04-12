package java15_thread;

public class Ex05_Priority extends Thread{ //priority == 우선순위

	private int idx; //인덱스 스레드
	
	public Ex05_Priority(int idx) {
		
		this.idx=idx;
		
	}
	
	
	
	@Override
	public void run() {
		System.out.println(idx + "스레드 시작");
		System.out.println(idx + "스레드 끝");
		
		for(int i=0;i<1000;i++) {
			System.out.print(idx);
		}
		System.out.println(idx + " 스레드 끝");

		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		Ex05_Priority t1=new Ex05_Priority(1);
		Ex05_Priority t2=new Ex05_Priority(2);
		Ex05_Priority t3=new Ex05_Priority(3);
		
		//우선순위 적용
		t1.setPriority(Thread.MIN_PRIORITY); //1		자바는 1~10까지 우선순위 10이 우선순위 1등
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MAX_PRIORITY); //10
		
		//스레드 활성화
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 끝");
		
	}
	
	

}

// Thread Scheduling, 스레드 스케줄링
// 	Round Robin, 순환할당 : time slice 만큼 스레드를 번갈아가면 실행한다 -> 라운드로빈
// 	time slice, 시간조각 
// 	
// 	Priority ,  우선순위 :  우선순위가 높은 스레드를 좀 더 많이 실행한다
	
//	자바는 Round Robin, Priority 두 알고리즘을 적용하여 스레드 스케쥴링을 수행한다

 	





















 
