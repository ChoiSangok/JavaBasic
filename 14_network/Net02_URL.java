package java14_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {

	public static void main(String[] args) {
		
		
		String urlStr="https://docs.oracle.com/javase/8/docs/api/java/net/URL.html";
		
		
		URL url=null;
		
		try {
			url=new URL(urlStr);
			
		} catch (MalformedURLException e) { //잘못된형식의 url일때
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로토콜  : "+url.getProtocol());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("파일경로 : "+url.getFile());
		System.out.println("전체 : "+url.toExternalForm());

	}
}
