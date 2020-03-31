package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex08_02_ObjectInputStream {

	public static void main(String[] args) {
		
		//파일 선언 객체
				File file=new File("./src/java13_io/filterStream","ObjectTest2.ser");
				
				//스트림 객체
				ObjectInputStream ois= null;
				
				try {
					//스트림 객체 선언
					ois= new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
					
					List list = (List)ois.readObject();
					System.out.println(list);
					
					for(int i=0;i<list.size();i++) {
						System.out.println(list.get(i));
					}
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(ois!=null) ois.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
	}

}
