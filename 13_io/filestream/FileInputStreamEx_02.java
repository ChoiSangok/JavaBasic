package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_02 {

	public static void main(String[] args) {
		
		
		File file= new File("./src/java13_io/","Source.txt");
		
		System.out.println("TEST exists : "+file.exists());
		
		int len=-1; //입력 한 길이
		byte[] buf= new byte[1024]; //저장소
		
		int total=0; //총 입력 길이
		
		StringBuilder sb= new StringBuilder(); //입력한 데이터 저장소
		
		FileInputStream fis=null; //파일 입력스트림
		
		try {
			fis=new FileInputStream(file); //파일 입력스트림 생성
			
			while((len = fis.read(buf))!= -1) { //파일입력
				sb.append(new String(buf,0,len));
				
				total+=len; //총 길이 계산
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(" 총 길이 계산 : "+ total + " B");
//		System.out.println(sb);
		
	}

}
