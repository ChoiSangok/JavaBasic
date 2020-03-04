package java06_class.method;

import java.util.Arrays;

public class MethodEx { //실행클래스

	public static void main(String[] args) {
		
		Method_01 m01=new Method_01(); //메소드 1 연결
		
		int res = m01.add(100, 200); //대입
		
		System.out.println("결과" + res);
		
		System.out.println(m01.add(45, 78));
		
		
		System.out.println("------------------------");
		
		
		Method_02 m02=new Method_02(); //정의
		
		m02.method01();
		
		System.out.println("+-------------------------------");
		
		m02.method02(100); //100 전달인자, 전달 인수 argument
		
		
		m02.printNum2(20, 54);
		System.out.println(m02.returnNun());
		
		System.out.println(m02.add(789,789));
		
		//---------------------------------------------
		
		Method_03 m03=new Method_03(); //Method 전체를 함
		
		int[] arr=new int[5]; //int형 배열
		int num;
		
		arr[2]=200;
		num=200;
		
		System.out.println("----- 메소드호출 전--------");
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
		
		m03.arrTest01(arr); //참조. reference전달
		m03.arrTest02(num); //값, value 전달
		
		System.out.println();
		System.out.println("메소드호출후---------");
		System.out.println(Arrays.toString(arr)); //toString 출력문
		System.out.println(num);
		
		System.out.println("-----------------------------");
		
		
		int n=m03.arrTest03();
		n=20;
		
		int[] ar=m03.arrTest04();
		ar[0]=99;
	}

}

