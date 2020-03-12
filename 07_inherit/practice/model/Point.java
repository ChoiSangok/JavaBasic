package java07_inherit.practice.model;

import java.util.Scanner;

public class Point{

	protected int x;
	protected int y;

	Scanner sc= new Scanner(System.in);
	//constructor
	public Point() {
		
	}
	public Point(int x,int y) {
		setX(x);
		setY(y);
	}
	
	//getter setter
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("x : " + x + " y : " +  y);
	}
	
}

