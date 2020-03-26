package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_02 {

	public static void main(String[] args) {
		
		
		//스트림 기본적으로 바이트 단위로 통신을 한다
		// 바이트스트림을 문자스트림으로 변환할 필요가 있다
		
		// InputStreamReader
		// OutputStreamWriter
		// 두 클래스를 이용하여 변환한다
		
		
		
		//표준입력 스트림 System.in -> Reader	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
		
		//표준출력스트림 System.out -> Writer
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out)) ;
		
		String str= null; //입력받은 문자열
		
		try {
			while( (str = reader.readLine()) != null) {
				writer.write(str); //문자열 출력
				writer.newLine(); //개행 -> 왜 하냐면 옆으로 나오기 때문에
				writer.flush(); //버퍼비우기
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) reader.close();
				if(writer!=null) writer.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}







