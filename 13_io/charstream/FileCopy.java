package java13_io.charStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileCopy {

	public static void main(String[] args) {
		
		//Source txt -> dest.txt
		// 문자스트림 (bufferedreader, printwriter) 복사
		
		//source txt 파일의 크기 4230 ㅠㅛㅅㄷㄴ
		File source = new File("./src/java13_io.","Source.txt");
		File dest = new File("./src/java13_io/charStream","Dest.txt");
		
		BufferedReader in=null;
		PrintWriter out= null;
		
	
		int total =0; //전체길이
		String str=  null; //입력받은 문자열
		
		
		
		try {
			//스트림생성
			in= new BufferedReader(new InputStreamReader(new FileInputStream(source)));
			out= new PrintWriter(new BufferedOutputStream(new FileOutputStream(dest)));
			
			
			while( ( str= in.readLine() )!=null) { //문자열로 입력				
				out.println(str);
//				total+=str.getBytes().length;
				total +=str.length(); // 복사 문자 
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(in !=null) in.close();
				if(out!= null) out.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("total : "+ total);
	

		
		
		
	}
}
