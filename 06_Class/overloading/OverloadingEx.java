package java06_class.overloading;

public class OverloadingEx {

	public static void main(String[] args) {
		
		Overloading_01 ol01=new Overloading_01();
		
		System.out.println("--------display()---------");
		
		ol01.display(); 
		
		System.out.println("----display(int, int)======");
		
		ol01.display(11,22);
		
		
		
		
		System.out.println("--------------오버로딩2-------");
		
		Overloading_02 ol02=new Overloading_02();
		
		
		int len= ol02.getLength(111222333);
		
		System.out.println(len);
		
		
		System.out.println(ol02.getLength(1234));
		
		System.out.println("true의 문자수 "+ol02.getLength(true));
		
		System.out.println("false의 문자수 "+ol02.getLength(false));
		
		System.out.println("12.4867의 문자수 "+ol02.getLength(12.4867));
	}
}
















