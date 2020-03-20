package java11_generic;


//class Class02{
//	private int data;
//	
//	public int display(int data) {
//		this.data=data;
//		return data;
//		
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//	
//	
//}

//제네릭 클래스
class Class02<T>{ //타입파라미터 클래스에
	
	private T data;
	
	public T display(T data) {
		this.data=data;
		return data;
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
public class Generic_02_GenericClass {

	public static void main(String[] args) {
		
		//T -> String
		Class02<String> c02=new Class02<>();
		
		c02.setData("banana");
		String fruit=c02.getData();
		
		System.out.println("과일: "+fruit);
		
		//--------------------------------------
		
		
		//T ->Integer
		
		Class02<Integer> c02_1= new Class02<>();
		
		
		
		
		
	}

}



// + 제네릭 클래스 
// 
// 		[접근제한자] [클래스식별자] class 클래스명<TYPE1, TYPE2, ...>{
// 			
// 		}
// 		
// - 제네릭이 적용된 클래스
// 
// - 제네릭 클래스를 이용하여 객체 생성을 할 때 타입 파라미터를 결정해주는 것이 좋다
// 
// - 타입파라미터를 결정하지 않으면 Object로 처리된다
// 
// 
// 
// - 제네릭 클래스의 변수를 선언할 때 타입파라미터를 명시하고
// 객체를 생성하는 코드에서는 <> 만 적는다 (JDK 1.7 이후 가능)
// 
// 		ex )	List<String> list=new ArrayList<>();

