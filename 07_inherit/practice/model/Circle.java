package java07_inherit.practice.model;

import java.util.Scanner;


public class Circle extends Point{
	
	
	
	private int radius;
	
	Scanner sc= new Scanner(System.in);
	
	//constructor
	public Circle() {
		//부모객체 에서
		this(0,0,0); //기본값
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y); //부모 생성자 호출
		
		setRadius(radius);
		
	}
	
	//x, y는 부모생성자로 넘김
	//center point(중심점)로 취급
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//원의 x, y좌표, 면적과 둘레 계산 출력함
//	java.lang.Math.PI 사용함
	public void draw() {
		System.out.println();
		System.out.print("중심점 : ");
		
		super.draw();
		
		System.out.println("원면적 : "+  String.format("%.1f", Math.PI * radius * radius));
		System.out.println("원둘레 : "+ String.format("%.1f", 2 * Math.PI * radius));
//		* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	}
	
}
