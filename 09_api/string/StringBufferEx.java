package java09_api.string;

public class StringBufferEx {

	public static void main(String[] args) {
		
		System.out.println("----StringBuffer()생성----");

		
		
		StringBuffer sb=new StringBuffer();
		
		info(sb);
		
//		System.out.println("length: "+ sb.length()); 	//문자열의 길이
//		System.out.println("capacity : "+ sb.capacity());	//문자열의 용량, 능력 한계 - 케파 //최대길이
		
		System.out.println("----StringBuffer(\"hello\")----"); //전체 코드내에서 \"\"로 문자열 출력
	//										\n \t \r 제어문자
		StringBuffer sb2=new StringBuffer("hello");
		
		info(sb2);
		
		System.out.println("\n----StringBuffer(5)------");
		StringBuffer sb3=new StringBuffer(5);
		info(sb3);


		System.out.println("\n---Apple추가------");
		sb3.append("Apple");
		
		System.out.println(sb3);
		info(sb3);
		
		System.out.println("\n---Banana추가-----"); //공간확장 
		sb3.append("Banana");
		System.out.println(sb3);
		info(sb3);
		
		//----------------------------------------------------
		//Quiz
		//StringBuilder
		
		System.out.println("\n----Orange-----");
		sb3.insert(5, "Orange");
		System.out.println(sb3);
		
		System.out.println("\n---deleteCharAt----");//원하는 문자제거
		sb3.deleteCharAt(3); //l 삭제
		System.out.println(sb3);
		
		System.out.println("\n---substring----");//문자열 자르기
		String sub=sb3.substring(1,7);
		//sb3.substring(1, 7);
		System.out.println("sb3 : "+sb3);
		System.out.println("sub : "+sub);
		System.out.println();
		info(sb3);
		
		System.out.println("\n---trimToSize---"); //
		sb3.trimToSize();
		info(sb3); //capacity 남는걸 length만큼 감소시키기
		
		System.out.println("\n---reverse()---");
		sb3.reverse();
		System.out.println(sb3);
		
	}
	public static void info(StringBuffer s) {
		System.out.println("length : "+s.length()); //문자열의 길이
		System.out.println("capacity : "+s.capacity()); //문자열의 용량, 능력 한계 - 케파 //최대길이
										//capacity 공식 ( (기존 capacity +1 ) *2 만큼 확장 )
	}
}



















