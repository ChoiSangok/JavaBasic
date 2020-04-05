package java14_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress { //*********************

	public static void main(String[] args) {
		
		InetAddress ip=null; //IP 주소 표현 객체
		
		try {
			//도메인네임을 통해 ip주소 얻기
			
			ip=InetAddress.getByName("www.iei.or.kr");

		} catch (UnknownHostException e) { //알수없는 호스트라면 발생하는 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		호스트 네임 : 노드들을 구분하기 위해 지정한 이름
//		도메인 네임 : 호스트네임의 일종으로 IP 와 매핑한 이름
		
		System.out.println("Hostname : "+ip.getHostName());
		System.out.println("HostAddress : "+ip.getHostAddress());
		
		System.out.println("------------------------------------------");
		
		
		try {
			//로컬호스트 (자기자신) 의 IP 정보를 얻어옴 ** 중요해요 로컬호슽 
			ip=InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//호스트 네임 반환 ** 중요
		System.out.println("Hostname : "+ip.getHostName());
		
		//호스트의IP 주소를 반환 ** 중요
		System.out.println("HostAddress : "+ip.getHostAddress());
		
		
		//알고있어야해요~
		byte[] ipAddr = ip.getAddress();
		
		System.out.println(Arrays.toString(ipAddr));
		
		for(int i=0;i<ipAddr.length;i++) {
			System.out.println(ipAddr[i] + 256); 
		}
	}
}

















