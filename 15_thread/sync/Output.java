package java15_thread.sync;

public class Output extends Thread{

	SyncData data;
	
	public Output(SyncData data) {
		this.data=data;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("===output start===");
		synchronized (data) {
			
			//덧셈이 완료되지 않은 상황
			
			if( !data.available ) {
				try {
					data.wait(); //wait 를 그냥하면 output의 wait이 된다
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("total : "+data.total);
		}
		
		
		System.out.println("===output end===");
		// TODO Auto-generated method stub
		
	}

}
