package java13_io.OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01 {

	public static void main(String[] args) {
		
		OutputStream os= null; //출력 스트림 객체
		
		os=System.out; //표준 출력
		
		try {
			os.write(97);
			os.flush(); //버퍼비우기
			
			os.write('b');
			os.write('c');
			os.write('\n'); 
			
			os.write('1');
			os.write('2');
			os.write('3');
			os.write('\n'); //개행문자는 flush 를 수행하지 않는다
			os.flush();



			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
			
			} catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
