package java13_io.filterStream;


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_DataOutputStream {

	public static void main(String[] args) {
		
		
		//출력 파일 객체 생성
		File file = new File("./src/java13_io/filterStream","DataTest.txt");
		
		DataOutputStream dos= null;
		
		try {
			dos= new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
			dos.write(100); //아스키코드
			
			dos.writeBoolean(true); //1b
			dos.writeChar('A'); //2B
			dos.writeInt(123);//4b
			dos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null); dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
