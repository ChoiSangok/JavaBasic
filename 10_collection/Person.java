package java10_collection;

import java.util.*;

public class Person {

	
	//person에 있는 정보를 정렬	
	private int no;
	private String name;
	private String hobby;
	
	//생성자
	public Person(int no, String name, String hobby) {
		setNo(no);
		setName(name);
		setHobby(hobby);
		
		
	}
	
	//getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person"+"["+"no : " + getNo()+" name : "+getName()+" hobby : "+getHobby();
				
	}
	
	
}
