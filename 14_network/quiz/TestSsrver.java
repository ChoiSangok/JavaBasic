package java14_network.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import com.sun.imageio.plugins.common.InputStreamAdapter;

public class TestSsrver {

	public static void main(String[] args) {
		
		ServerSocket servSock=null;
		PrintWriter out=null;
		
		Socket sock=null;
		BufferedReader in = null;
		File file =new File("./src/java14_network/quiz/","receive.txt");
		
		String str=null;
		
		try {
			System.out.println("서버 호스트입니다~");
			servSock= new ServerSocket(10004);
			sock=servSock.accept();
			
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(new FileOutputStream(file),true);
			
			while((str=in.readLine()) !=null) {
				out.print(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if(out!=null) out.close();
				if(in!=null) in.close();
				if(servSock !=null) servSock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}











