package java14_network.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex04_Client {

	public static void main(String[] args) {
		
		Socket sock=null;
		PrintWriter out = null;
		File file=new File("./src/java14_network/quiz/","data.txt") ; //경로설정
		
		
		
		BufferedReader br=null;
		FileInputStream fi=null;
		
		String str= null;
		
		try {
			System.out.println(" *** 클라이언트 실행 *** ");
			
			sock= new Socket("localhost",10004);
			
		
			//입력
			br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			//출력
			out=new PrintWriter(sock.getOutputStream(), true);
			
			str = br.readLine();
			out.print(str);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
			if(out!=null)	out.close();
			if(br!=null)	br.close();
			if(sock !=null)	sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	
		
		
		
	}
}
