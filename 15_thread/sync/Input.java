package java15_thread.sync;

public class Input extends Thread{
	
	SyncData data;
	
	public Input(SyncData data) {
		this.data= data;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("===input start");
		
		synchronized (data) {
			for(int i=1;i<=100;i++) {
				data.total += i;
			}
			data.available=true; //데이터덧셈완료 상태
			
			data.notify(); //LOCK상태 통지
			data.notifyAll(); //LOCK 상태 통지
		}

		System.out.println("===input end===");
		
		
	}


}
