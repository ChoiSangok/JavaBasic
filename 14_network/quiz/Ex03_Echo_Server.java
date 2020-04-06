package java14_network.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_Echo_Server {

	public static void main(String[] args) {
		
		ServerSocket servSock=null;
		Socket sock=null;
		
		BufferedReader br=null;
		
		PrintWriter out=null;
		
		
		try {
			System.out.println("*** 서버 호스트입니다 ***");
			servSock= new ServerSocket(10001);
			sock=servSock.accept();
			
			//버퍼리더
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			String str=br.readLine();
			System.out.println();
			System.out.println(str);
			
			//쏴줘야한다
			
			out = new PrintWriter(sock.getOutputStream(),true);
			out.println(str);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if(br!=null)	br.close();
			if(sock!=null) sock.close();
			if(servSock!=null) servSock.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
