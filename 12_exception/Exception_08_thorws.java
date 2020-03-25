package java12_exception;

import java.io.IOException;

class ThrowsTest{
	
	public void method() throws IOException {
		
		throw new IOException();
	
	}
}


public class Exception_08_thorws {

	public static void main(String[] args) { //메인메소드에 throws 절대 하면 안된다
		
		
		
		ThrowsTest tt= new ThrowsTest();
		
		try {
			tt.method();
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		

		
	}
}
