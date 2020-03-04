package java06_class.field;

public class MemberField_03 {

	private int num=777;	//인스턴스 변수
	private static int num2=555;//클래스변수, 정적변수

	
	public void method(int var) {//var, 매개변수도 -> 지역변수로 
		
		int num=101; //지역변수
		int num2=202; //지역변수
		
		System.out.println(this.num); //this 자기자신인~
//		System.out.println(this.num2);
		System.out.println(MemberField_03.num2);
		
	}
	
	
}
