package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04_BufferedCopy {

	public static void main(String[] args) {
		
		
		//BufferedStream 을  이용한 파일 복사
		
		//Source txt - dest txt로 복사
		
		//파일 객체
		
		File src= new File("./src/java13_io/","Source.txt");
		File dest= new File("./src/java13_io/filterStream","Dest.txt");
		
		
		FileInputStream fis= null;
		FileOutputStream fos= null;
		//입출력 스트림
		BufferedOutputStream bos = null;
		BufferedInputStream bis= null;
		
		//보조변수들
		int len =-1; // -1 이나 0 상관없다
		byte[] buf= new byte[1024]; //데이터 임시저장소
		int total=0; //총길이
		
		try {
			fis= new FileInputStream(src);
			fos= new FileOutputStream(dest);
			
			bis= new BufferedInputStream(fis);
			bos= new BufferedOutputStream(fos);
			
			while( (len = bis.read(buf))!=-1) {
				
				bos.write(buf, 0, len); // 파일 출력
//				bos.flush(); //버퍼 비우기
				
				total+=len;
				
			}
			bos.flush(); //버퍼 비우기
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//순서 상관없ㅇ므
				if(bos!=null); bos.close();
				if(fis!=null); fis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("바이트 : "+ total + "Byte");
		
	}

}
