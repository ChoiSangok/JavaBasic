package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {

	public static void main(String[] args) {
		
		
		
		File file= new File("./src/java13_io.", "Source.txt");
		
		System.out.println("TEST file : "+file.exists());
		
		//파일 입력 스트림 객체
		
		FileInputStream fis= null; //1차 스트림
		BufferedInputStream bis=null;//2차 스트림 , 성능 향상 보조스트림
		
		byte[] buf = new byte[1024]; //입력 데이터 임시 저장소
		int len = 0; //입렉 데이터 길이ㅣ
		
		try {
			fis= new FileInputStream(file); //file -> fileinputstream
			bis= new BufferedInputStream(fis); //FileInputStream =-> BufferedInputStream 
			
//			while( ( len = fis.read(buf))!=-1) {
			while( ( len = bis.read(buf))!=-1) {
//				System.out.println(new String(buf, 0,len));
			}
//			bis = new BufferedInputStream(new FileInputStream(file)); //이렇게 많이 씀
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { //스트림 닫기
				
				if(bis!=null) bis.close();
				if(fis!=null) fis.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}
