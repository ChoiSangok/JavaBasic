package java15_thread.sync;

public class WaitNotifyEx {//메인메소드

	public static void main(String[] args) {
		
		SyncData data= new SyncData();
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
				
		
		
	}

}
