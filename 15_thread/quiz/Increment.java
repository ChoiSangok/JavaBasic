package java15_thread.quiz;

public class Increment implements Runnable{

	private int in1;
	
	
	
	public Increment(int in1) {
		this.in1=in1;
		
	}
	
	public void run() {
		
		
		// TODO Auto-generated method stub
		for(int i=1;i<=in1;i+=2) {
			System.out.println("InThread "+ i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
