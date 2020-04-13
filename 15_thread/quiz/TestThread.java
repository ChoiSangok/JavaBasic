package java15_thread.quiz;

import java.util.Scanner;

public class TestThread {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Increment 써");
		
		int incr= sc.nextInt();
		
		System.out.println("Decrement 써");
		int decr=sc.nextInt();
		int decr2= sc.nextInt();
		System.out.println("메인스레드");
		
		
		Increment inc= new Increment(incr);
		Decrement dec= new Decrement(decr,decr2);
		
		
		Thread threadExecutor = new Thread(inc); //스레드 발생
		Thread threadExecutor1 = new Thread(dec); //스레드 발생 2
		
		threadExecutor.start();
		threadExecutor1.start();
		
		
		System.out.println(threadExecutor);
		System.out.println(threadExecutor1);
		
	}
}
