package java13_io.OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03 {

	public static void main(String[] args) {
		
		OutputStream os = System.out;// 표준 출력 스트림
		
		byte[] b = new byte[1024];
		
		
		int len=0; //의미있는 데이터의 길이
		
		b[len++] = 'A';
		b[len++] = 'p';
		b[len++] = 'p';
		b[len++] = 'l';
		b[len++] = 'e';
		b[len++] = '\n';
		b[len++] = 'H';
		b[len++] = 'i';
		b[len++] = '\n';
		
		try {
			os.write(b,0,len); //0번째 인덱스부터 len 만큼 출력
			os.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(os!=null) os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
