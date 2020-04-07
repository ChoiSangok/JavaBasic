package java14_network.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

	public static void main(String[] args) {
		
		Socket sock=null;
		
		PrintWriter out=null;
		File file=new File("./src/java14_network/quiz/","data.txt") ; //경로설정
		BufferedReader in =null;
		
		FileInputStream fi=null;
		
		String str=null;
		
		try {
			System.out.println("클라이언트 실행");
			sock=new Socket("localhost",10004);
			
			//파일입력
			in= new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			out= new PrintWriter(sock.getOutputStream(),true);
			
			str=in.readLine();
			out.print(str);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
