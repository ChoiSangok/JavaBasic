package java08_abstract;


//추상클래스
abstract class Person{ //부모클래스 추상클래스
	protected String name; //d이름
	
	
	public abstract void display(); //객체의 정보를 출력하는 기능
		
		
	
	
	public Person(String name) { //생성자
		
		this.name=name;
	}
}

class Professor extends Person{ //자식클래스

	private String major; //전공
	
	public Professor(String name, String major) {//생성자
		super(name); //지정한 슈퍼생성자

		this.major=major; //초기화 해주는 코드
		
	}
	@Override
	public void display() {
		System.out.println("교수 "+ name + major);
	}
	
	
	
}


class Student extends Person{
	private String subject; //수강과목
	
	public Student(String name, String subject) {
		super(name);
		
		this.subject=subject;
	}

	@Override
	public void display() {
		System.out.println("학생"+ name+","+subject+"수강");
		
	}
	
	
}


public class AbstractEx {

	public static void main(String[] args) {
	
		
		Student s= new Student("alice", "자바");
		Professor p =new Professor("bob","컴퓨터공학");
		
		System.out.println("----------------------");
		
		Person p1=new Student("clar", "자바");
		Person p2=new Professor("dava","컴퓨터공학");
		
		p1.display();
		p2.display();
				
		
		System.out.println("=----------------");
		
		Person[] arr=null;	//배ㅔ열 선언
		
		arr=new Person[5]; //배열생성
		
		arr[0]=new Professor("APPLE", "BANANA");//객체생성
//		arrr[1]=new Person("test");// person은 추상클래스
		arr[2]=new Student("cherry", "durian");//객체생성
				
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=null) { //null 일때 break
				
			arr[i].display();
			}
		}
	
		
		
		
		
	}

}
