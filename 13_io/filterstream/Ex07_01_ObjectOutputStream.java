package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point implements Serializable{

	private int x;
	
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point x="+x+" y="+y;
	}
	
}
public class Ex07_01_ObjectOutputStream {

	public static void main(String[] args) {
		
		//파일 객체 생성
		File file=new File("./src/java13_io/filterStream","ObjectTest.ser");
		
		//스트림 객체
		ObjectOutputStream oos= null;
		
		try {
			oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			//출력 대상 객체 생성
			Point p1= new Point(11,22);
			Point p2= new Point(111,222);
			Point p3= new Point(1111,2222);
			
			
			//출력
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if(oos!=null);	oos.close(); //스트림닫기
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


















