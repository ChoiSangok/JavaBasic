package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_03 {

	public static void main(String[] args) {
		
		//표준입력 스트림 System.in -> Reader	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
		
		//표준출력 스트림 System.out -> PrintWriter
		//? 이게뭐람?
		
		PrintWriter out = new PrintWriter(
				new BufferedOutputStream(System.out),true); //autoflush
										//System.out <- 여기가 바뀜
		//입력은 bufferedreader
		//출력은 printwriter
		
		String str=null; // 입력받은 문자열
		
		try {
			while( (str = in.readLine())!=null) {
				out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//스트림닫기
			if( out!=null) out.close();
			try {
			if(in!=null)	in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
