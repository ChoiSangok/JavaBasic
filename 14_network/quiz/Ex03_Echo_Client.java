package java14_network.quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_Echo_Client {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); //입력
		
		Socket sock=null;
		
		PrintWriter out=null; //보내
		
		BufferedReader in = null; //읽어
		

		//
		
		String str=null;
		
		try {
			
			sock=new Socket("localhost",10001);
			
			System.out.println("문자를 입력하세요: ");
			str=sc.nextLine();
			out=new PrintWriter(sock.getOutputStream(),true);
			out.println(str);
			

//			bp=new Bufferedou(new OutputStreamWriter(sock.getOutputStream()));
			in=new BufferedReader(new InputStreamReader(sock.getInputStream()));

			str=in.readLine();
			System.out.println();
			System.out.println(str);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
		
	}


}
