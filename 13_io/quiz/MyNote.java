package java13_io.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class MyNote {

	
	Scanner sc= new Scanner(System.in);
	
	
	
	public void fileSave() {
		StringBuilder sb= new StringBuilder(); // 입력한데이터 저장소
		
		
		String str;
		
		String filename = null;
		
		System.out.println("텍스트를 입력하세요: ");
		
		while( true ) {
			str=(sc.nextLine()+"\n");

			if(str.equals("exit\n")) { break;}

			sb.append(str);
		}
		System.out.println("저장하시겠습니까? : (y/n) : "); char check=sc.next().charAt(0);
		if(check=='y'||check=='Y') {
			System.out.println("저장할 파일명: "); filename=sc.next();

		}
		PrintWriter pw = null;
		
		try {
//			pw = new PrintWriter(filename);
			pw=new PrintWriter(new FileWriter("D:\\java\\workspace\\JavaBasic\\src\\java13_io\\"+filename+".txt"),true);
			pw.println(sb);
			System.out.println(filename+"성공적입력");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
	
	
	public void fileOpen( ) { //v파일오픈~
	

		String str=null;
		
		System.out.println("열기할 파일명: "); String filename=sc.nextLine();
		
		BufferedReader in=null;
		
		
		try {
			in=new BufferedReader(new FileReader("D:/java/workspace/JavaBasic/src/java13_io/"+filename+".txt"));
			
			while( ( str = in.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(in!=null) in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void fileEdit() {
		
		System.out.println("수정할 파일명 : "); 
		
		String filename=sc.next();
		
		BufferedReader reader = null;
		
		//표준출력스트림 System.out -> Writer
		PrintWriter writer= null;
		String str= null; //입력받은 문자열
		
		StringBuilder sb= new StringBuilder(); //입력한 데이터 저장소
	
		try {
			File file  = new File("D:/java/workspace/JavaBasic/src/java13_io/"+filename+".txt");
			reader=new BufferedReader(new FileReader(file));
			writer=new PrintWriter(new FileWriter(file,true),true);//
			//printWriter의 , true =autoflush // FileWriter ,true =추가 안추가
			
			while(( str=reader.readLine()) !=null) {
				System.out.println(str);
			}
			//파일에 내용추가
			System.out.println("파일에 추가할 내용을 입력하시오: "); //내요우가
			while(true) {
				str=sc.next(); //내용추가맨~
				
				if(str.equals("exit")) { break;}

				sb.append(str+"\r\n"); //위에 코드 가지고옴	
			}
			//변경된 내용추가 코드 좀 헷갈려?
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			char check=sc.next().charAt(0);
			if(check=='y'||check=='Y') {
				System.out.println("파일에 기록함");	
				System.out.println(filename+".txt"+"가 성공적으로 입력되었다맨");
			}	
			writer.print(sb);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
	
				if(reader!=null) reader.close();
				if(writer!=null) writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
