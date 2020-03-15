package java09_api;



class Point implements Cloneable{
	int x;//x좌표
	int y;//y좌표
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;		
	}

	@Override //toString 단축키 alt+shift+s, s
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
//	@Override //toString 변경 오버라이딩
//	public String toString() { //왜?
//		
//		// TODO Auto-generated method stub
//		return "(" + x + "," + y + ")";
//	}
	@Override
	public boolean equals(Object obj) {

		//p2.equals(p3)
		
		//p2 -> this
		//p3 -> obj
		
		if(this.x==((Point)obj).x && this.y==((Point)obj).y ) {
			return true;
			
		}
		return false;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}



public class ObjectEx {

	public static void main(String[] args) {

		Object obj=new Object();
		Point p1= new Point(10, 20);
		
		System.out.println(obj.toString());
		System.out.println(p1.toString());
		
		System.out.println("--------------------------");

//		System.out.println()의 전달인자로 객체가 사용되면
//		ToStrin()의 반환값을 출력한다
		
		System.out.println(obj);
		System.out.println(p1);
		
		System.out.println("\n----equals-------");
		
		Point p2= new Point(11, 22);
		Point p3=new Point(11, 22);
		Point p4=p2;
		
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
		System.out.println("p4 : "+p4);
		
		//동일성을 비교하는 코드 - identity
		//같은 객체인지 확인, 같은 참조대상을 가리키고 있는지 확인
		// == 연산자
		System.out.println("p2==p3 : "+ (p2==p3));
		System.out.println("p2==p4 : "+ (p2==p4));
		
		System.out.println("--------------------------");
		
		
		//동등성을 비교하는 코드 - equality
		
		// 같은 값인지 확인, 참조대상의값이 같은 값인지 확인
		// equals() 메소드
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
		
		
		System.out.println("\n----hashCode-------");
		
		
		System.out.println("p2 : "+p2.hashCode());
		System.out.println("p3 : "+p3.hashCode());
		System.out.println("p4 : "+p4.hashCode());
		
		System.out.println("--------------------------");
		
		String s1= new String("apple");
		String s2= new String("apple");
		String s3= new String("banana");
		String s4= s1;
		
		System.out.println("s1 : "+ s1.hashCode());
		System.out.println("s2 : "+ s2.hashCode());
		System.out.println("s3 : "+ s3.hashCode());
		System.out.println("s4 : "+ s4.hashCode());
		
		// 문자열 String은 hasCode() 메소드를 오버라이딩 하고 있다
		// 문자열의 내용물 (각 char데이터)를 가지고
		// 재생산된 고유값을 반환한다
		
		System.out.println("\n----clone-------");
		
		Point p_ori=new Point(33, 44);
		
		Point p_clone1 = p_ori; //얕은 복사
		
		//생성자를 이용한 깊은 복사
		Point p_clone2= new Point(p_ori.x, p_ori.y);
		
		
		
		//clone()을 이용한 객체 복사 (깊은 복사)
		Point p_clone3=null;
		try {
			p_clone3=(Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p_clone3);
		System.out.println("p_ori.equals(p_clone3) : "
				+ p_ori.equals(p_clone3));
		
		System.out.println("p_ori == p_clone3) : "+ (p_ori==p_clone3));
		
	}

}



//+ Object 클래스의 메소드
//
//- 재정의(override) 불가 메소드
//
//	// 스레드 동기화에 사용
//	notify
//	notifyAll
//	wait
//
//	// 클래스의 타입 정보를 반환( Class 타입) 
//	getClass
//
//- 재정의(override) 가능 메소드
//	
//	toString 
//		객체를 설명하는 문자열 반환
//
//		기본리턴값 - "데이터타입 @참조값" 형식의 문자열
//
//		System.out.println() 메소드의 전달인자 객체를
//		사용하면 해당 객체의 toString() 반환값을 출력한다.
//
//
//	equals
//		객체가 같은 값을 가지고 있는지 비교하는 코드로 재정의해서 사용
//
//		** 주의 : 기본동작은 같은 객체인지 비교한다
//		(동일성, identity)
//
//
//		
//	hashCode 
//		객체의 고유값을 반환한다
//
//		기본동작으로는 객체의 참조값을 10진수(int)로 반환한다
//
//		** String 은 같은 데이터라면 같은 HashCode를 반환한다
//		** String 은 동등한 객체에서 같은 HashCode를 반환한다
//
//
//
//	clone
//		객체 복사 메소드 
//
//		protected 접근제한자로 설정되어있다
//		사용하려는 클래스에서 public 으로 오버라이딩한 후 사용한다
//
//		반환 타입이 Object이므로 형변환 필요하다
//
//		예외 처리 구문(try-catch)을 추가해야한다
//
//		clone() 을 구현하려는 클래스는 interface Cloneable을 상속해야한다
//
//		깊은 복사가 이루어진다.
//
//
//	finalize
//		GC(Garbage Collector, 가비지 콜렉터)가 객체를 파괴할 때
//		호출하는 메소드
//
//		건들이지 말 것!
//		재정의하지 마시오






