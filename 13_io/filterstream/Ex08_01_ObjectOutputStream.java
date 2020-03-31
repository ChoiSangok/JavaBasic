package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable{
	private String name;
	private int age;
	
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : "+this.name+" 나이 : "+this.age;
	}
}


public class Ex08_01_ObjectOutputStream {

	public static void main(String[] args) {
		
	
		//파일 선언 객체
		File file=new File("./src/java13_io/filterStream","ObjectTest2.ser");
		
		//스트림 객체
		ObjectOutputStream oos= null;
		
		try {
			//스트림 객체 선언
			oos= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			List list= new ArrayList();
			
			list.add(new Point(10,20));
			list.add(new Person("alice", 22));
			list.add(new Point(55,66));
			list.add(new Person("bob", 21));
			list.add(new Person("clara", 44));
			
			oos.writeObject(list); //파일 출력
			oos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
