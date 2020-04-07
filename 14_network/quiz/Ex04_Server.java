package java14_network.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_Server {
//	 - serv : ServerSocket
//	 - sock : Socket
//	 - in : BufferedReader
//	 - file : File
//	 - out : FileWriter
//	-------------------------
	public static void main(String[] args) {

		
		ServerSocket servSock=null; //서버 리슨 소켓
		Socket sock=null;			//서버 통신 소켓
		BufferedReader in= null; //입력
		File file =new File("./src/java14_network/quiz/","receive.txt");
		String str=null;
		
		PrintWriter out=null; //출력
		
		try {
			System.out.println(" ***  서버 호스트 입니다   *** ");
			
			servSock = new ServerSocket(10004);
			
			System.out.println(" Listen Port : "+servSock.getLocalPort());
			sock=servSock.accept();
			InetAddress ip=sock.getInetAddress();
			System.out.println("ip정보: "+ip.getHostAddress() );
			System.out.println("port 정보: "+sock.getPort());
			
			//입력스트림
			in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			// c출력스트림
			out= new PrintWriter(new FileOutputStream(file),true);
			
			while((str = in.readLine()) != null){
				System.out.println("파일정보: "+str);
				out.print(str);
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(out !=null) out.close();
				if(in !=null) in.close();
				
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	

	
	

}
