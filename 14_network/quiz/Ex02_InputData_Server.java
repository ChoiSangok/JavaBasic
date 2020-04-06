package java14_network.quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Ex02_InputData_Server {

	public static void main(String[] args) {

		
		//서버리슨소켓
		ServerSocket servSock=null;
		Socket sock= null; //통신소켓
		BufferedReader br= null;
		
		try {
			System.out.println("서버 호스트입니다");
			servSock= new ServerSocket(10001);
			sock=servSock.accept();
			
			
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String str = br.readLine();
			System.out.println();
			System.out.println(str);
			
			
			
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {

				try {
		            if(br!=null)br.close();
		            if(sock!=null) sock.close();
		            if(servSock !=null) servSock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
           
			
		}
		
		
	}
}
