package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {

	public static void main(String[] args) {
		
		
		//출력 대상 파일 객체
		File file= new File("./src/java13_io/filterStream/","BufferedOut.txt");
		
		//파일 출력 스트림 객체
		FileOutputStream fos= null;
		BufferedOutputStream bos= null;
		
		try {
			fos= new FileOutputStream(file,true); //추가모드
			bos = new BufferedOutputStream(fos);
			
			//파일출
			bos.write("Orange".getBytes());
			bos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close();
				if(fos!=null) fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
