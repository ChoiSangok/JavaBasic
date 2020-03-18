package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection06_Properties {

	public static void main(String[] args) {
		
		Properties prop=new Properties(); //properties 객체
		
		try{
			
			//파일 -> Properties 정보 불러오기
			
			prop.load(
		
				new FileReader("./src/java10_Collection/user.properties") );
			System.out.println(prop);
			
			System.out.println("-----------------------------");
			
			//속성 값 가져오기
			String user = prop.getProperty("username"); //키값
			System.out.println("user : "+user);
			String pass=prop.getProperty("password");
			System.out.println("password : "+pass);
			
			//인증 Authentication, auth
			if("abc".equals(user)&&"123".equals(pass)) {
				System.out.println("로그인에 성공하셨습니다");
			}else {System.out.println("로그인에 실패하셨습니다");}
			
			//---------------------------------------------------------
			
			user="abc";
			pass="123";
			
			prop.setProperty("username", user);
			prop.setProperty("password", pass);
			
			System.out.println(prop);
			
			//Properties 정보 -> 파일 기록
			prop.store( new FileWriter("./src/java10_Collection/user.properties"),"user information");
			
			
		} catch(FileNotFoundException e) { //예외처리
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		 
		//시스템 정보 Properties 얻기
		Properties sysProp=System.getProperties();
		
		System.out.println("---자바 버전---");
		System.out.println(sysProp.getProperty("java.version"));
		
		System.out.println("\n---OS 이름---");
		System.out.println(sysProp.getProperty("os.name"));
		
		System.out.println("\n---사용자 계정---");
		System.out.println(sysProp.getProperty("user.name"));
		
		System.out.println("\n----------");
		System.out.println(sysProp);
		
		// ./ -> 현재위치를 나타내는 경로
		// 자바프로그램은 현재위치를 클래스패스(Class Path)로 제공한다
		
		//클래스패스 : 프로그램이 실행된 위치 -> 프로젝트 폴더
		
		
		
	}

}





