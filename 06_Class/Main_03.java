package java06_class;

import org.omg.CORBA.PUBLIC_MEMBER;

import jdk.nashorn.internal.objects.annotations.Setter;

public class Main_03 {
	public static void main(String[] args) {
		
		Class_03 c01=new Class_03(); //한명에 대한 정보
		Class_03 c02=new Class_03();
		
//		c01.num=10; //접근제한자때문에 사용 불가
		
		c01.setNum(10);//setter 호출
		
		int num=c01.getNum();//getter 호출
		
		System.out.println(num);
		
		System.out.println(c01.getNum());
	}
}
