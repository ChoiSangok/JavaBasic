package java13_io.OutputStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02 {

	public static void main(String[] args) {
		
		
		OutputStream os= System.out; //표준 출력 스트림
		
		byte[] b= new byte[1024];
		
		b[0]='A';
		b[1]='B'; 
		b[2]='C';
		b[3]='\n';
		b[4]='1';
		b[5]='2';
		b[6]='\n';
		
		try {
			os.write(b);
			os.flush();
			
			System.out.println("\n-----------");
			String str="Hello Hi";
			byte[] tmp=str.getBytes();
			
			os.write(tmp);
			os.flush();
			
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	
	}

}
