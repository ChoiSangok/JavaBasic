package java11_generic;


class Class03{
	
	//일반메소드
	public void display(int n) {
		
	}
	
	//제네릭메소드
	public <T> T print(T t) { //반환타입, 매개변수, 지역변수에서 사용
		
		T data=(T)null;	 //형변환에도 사용할 수 있다
		return data;
		
	}
}


//제네릭 클래스 
class Class03_2<T>{
	
	//제네릭 메소드
	public <K> void display(K obj, T data) {
		
	}
}


public class Generic_03_GenericMethod {

	public static void main(String[] args) {
		
		
		Class03 c03 = new Class03();
		
		//-------------------------------------
		
		c03.<Integer>print(123); //타입파라미터 전달하지 않음 T- Integer
		
		
//		c03.<Double>print(555); //T- double
		c03.<Double>print(5.55); //T- Double 타입을 맞춰
		
		
		
		
		
		
	}

}


// + 제네릭 메소드
// 	
// 	[접근제한자] <TYPE1, TYPE2, ...> [리턴타입] 메소드명(매개변수) {
// 		//동작코드
// 	}

// - 메소드 내에서 사용되는 데이터타입을 일반화시켜 정의한다
// - 매개변수, 반환타입, 지역변수, ...
// 
// - 제네릭 메소드를 호출하면서 타입파라미터를 결정해준다
// 	
// 			ex)		obj.<타입파라미터> 메소드명(인자);
// 			
// 			ex)		obj.메소드명(인자);
// 					-> 매개변수가 타입파라미터를 사용하고 있어야 가능
// 





















