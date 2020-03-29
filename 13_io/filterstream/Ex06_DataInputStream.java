package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_DataInputStream {

	public static void main(String[] args) {
		
		
		File file = new File("./src/java13_io/filterStream","DataTest.txt");
		
		DataInputStream dis=null;
		
		try {
			//데이터 입력 스트림 생성
			dis= new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			
		
			int d1= dis.read();
			boolean d2= dis.readBoolean();
			char d3=dis.readChar();
			int d4=dis.readInt();
			
			System.out.println("d1 : " +(char)d1);
			System.out.println("d1 : "+d2);
			System.out.println("d1 : "+d3);
			System.out.println("d1 : "+d4);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null); dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
