package java07_inherit.practice.controller;

import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {

	public static void main(String[] args) {
	//	Circle c = new Circle();
		//Rectangle r =new Rectangle();
		Circle c1= new Circle();
		Rectangle r1= new Rectangle(); // class 가져온
		
		Scanner sc= new Scanner(System.in);
		
		Circle[] c= new Circle[3];		//circle안에 값을 넣을 공간
		Rectangle[] r= new Rectangle[3];
		
		Point[] p=new Point[5]; //포인트형 배열
		
		
			//값지정
			c[0]=new Circle(1,2,3); //공간에 
			r[0]=new Rectangle(4,5,6,8);
			c[1]=new Circle(4,5,6);
			r[1]=new Rectangle(1,2,3,4);
			c[2]=new Circle(7,8,9);
			r[2]=new Rectangle(2,3,4,5);
//			
		
		System.out.println("---------------------");
		System.out.println("원구하기~");
	
		for(int i=0;i<3;i++) { //draw 함수circle
			c[i].draw();
			
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("사각형 구하기~");

		for(int i=0;i<3;i++) { //draw 함수 ratangle
			r[i].draw();
		}
		//객체배열 선언
		//polymorphism 다형성
		//사용할 핵심
		p[0]=new Point(1,2);
		p[1]=new Point(11,22);
		p[2]=new Point(31,42);
		p[3]=new Point(81,62);
//		arr[0] = new Circle();
//		arr[1] = new Rectangle();
//		arr[2] = new Circle(2,3,4);
//		arr[3] = new Rectangle(5,67,75,4);
//		arr[4] = new Rectangle(65,5,74,3);
//		
//		p[4]=new r(1,2,3,4);
		System.out.println("----------------------");
		System.out.println("Point 출력");
		for(int i=0;i<5;i++) {
			
			p[i].draw(); //핵심 상속이란 값으로 묶여있지만 오 신기
		}
		
		
	}
}
