package java13_io.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//+ 파일 복사2, File Copy2
//- Lower.txt 파일을 Upper.txt로 복사한다
//
//- Lower.txt에서 읽은 문자가 소문자라면 대문자로 변환한다 
//

public class Quiz2 {
	public static void main(String[] args) {
		
		
		File file=new File("./src/java13_io/","Lower.txt");
		File file1 = new File("./src/java13_io/","Upper.txt");
		
		System.out.println("TEST exists : "+ file.exists());
		
		int len; //길이
		int total =0; //전체 길이
		byte[] buf=new byte[1024]; //버퍼
		
		
		FileInputStream fis=null; //파일 입력 스트림 객체
		FileOutputStream fos= null; //파일 출력 스트림 객체
		
		try {
			fis=new FileInputStream(file);
			
			fos=new FileOutputStream(file1);
			
			while((len = fis.read(buf))!=-1) { //소문자를 대문자로
				
				if(len>=97 && len<=122) { //소문자를 대문자로
					len-=32; //아스키코드
				}

				//출력
				fos.write(len);
				fos.flush();
				
				total++;
				
			}
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("실패하셨습니다");
			}
			
		}
		
		
		System.out.println("총 바이트: "+total+" Byte");

	}

}
