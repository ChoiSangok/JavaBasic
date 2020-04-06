package java14_network.quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_InputData_Client {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		Socket sock = null;
		
		PrintWriter out=null;
		BufferedReader in =null;
		
		String str=null;
		
		
		try {
			
			sock = new Socket("localhost", 10001);
			
			
			System.out.println("입력"); 
			str =sc.nextLine();
			out=new PrintWriter(sock.getOutputStream(),true);			
			out.println(str);
			
			
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
