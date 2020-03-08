package java06_class.manage;

import java.util.Scanner;

public class StudentService {

	Student stu=new Student();
	Scanner input=new Scanner(System.in);
	
	
	public StudentService() { //생성자
		
	}
	
	public void insertInfo() { //이름과 나이 입력
		
		
		System.out.print("이름: "); stu.setName(input.next());
		System.out.print("나이: "); stu.setAge(input.nextInt());
	}
	
	public void insertScore() { //국영수 점수 입력
		System.out.print("국어점수입력 " );
		stu.setKor(input.nextInt());
		System.out.print("영어점수입력 " );
		stu.setEng(input.nextInt());
		System.out.print("수학점수입력 ");
		stu.setMath(input.nextInt());
	}
	
	public void calcSum() {
		
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());

	}
	public void calcAvg() {
		
		stu.setAvg(stu.getKor()+stu.getEng()+stu.getMath()/3.0);
	}
	
	public void printStu() { //학생 정보 출력
		System.out.println("----정보출력----");
		System.out.println("이름: "+ stu.getName());
		System.out.println("나이: "+stu.getAge());
		System.out.println("국어: "+stu.getKor());
		System.out.println("영어: "+stu.getEng());
		System.out.println("수학: "+stu.getMath());
		calcSum();
		calcAvg();
		System.out.println("합계: "+stu.getSum());
		System.out.println("평균: "+ String.format("%.2f", stu.getAvg())); 
		
		
	}
	
	
	
}
