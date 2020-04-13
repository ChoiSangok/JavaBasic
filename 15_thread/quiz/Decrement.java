package java15_thread.quiz;

public class Decrement implements Runnable{

	private int d1,d2;
	
	
	public Decrement(int d1,int d2) {
		this.d1=d1;
		this.d2=d2;
		
	}
	@Override
	public void run() {

		
		// TODO Auto-generated method stub
		for(int i=d2;i >=d1;i--) {
			System.out.println("DeThread : "+ i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
