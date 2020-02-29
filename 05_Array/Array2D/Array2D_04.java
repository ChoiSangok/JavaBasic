package java05_array.array2D;
import java.util.*;

public class Array2D_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1~3학년
		//2개의반
		//4명의 학생
		//3과목 점수
		int[][][][] score =new int[3][2][4][3];//3개의 학년//2개의반 //4명의학생 //3과목
		
		//너무 차원이 넓다 그렇다면
		//분할!
		int [][][] sco1 =new int [2][4][3];
		int [][][] sco2 =new int [2][4][3];
		int [][][] sco3 =new int [2][4][3]; 
		//학년별로 따로 관리하기
		
		//--------------------------------------
		//문제!
		//2명의 학생의 정보
		//국어,영어,수학의 정보를 입력해서 저장
		//총점, 평균 계산
		// 전체 출력
		final int STUDENT_NUM=3; //학생수를 상수로 만들면 편리하다
		//확장성을 원한다면 사용하면 좋다		
		System.out.print("학생의 수를 입력하세요 : ");
		int person =sc.nextInt(); //학생수 입력
		
		
		int [][] sco=new int [person][3];
		int [] sum=new int[person];
		
		double [] avg=new double[person];
		System.out.println("-----------점수 입력란-------------");
		String [] subject = {"국어","수학","영어"};
		
		
		for(int i=0;i<person;i++) {
			for(int j=0;j<3;j++) {
				System.out.print((i+1)+"번 학생의 "+subject[j]+" 점수를 입력하세요 : ");			
				sco[i][j]=sc.nextInt();
				sum[i]=sco[i][j]; //총점계산				
			}	System.out.println("-------------------------------");
			avg[i]=sum[i]/3.0; //평균계산
		}
		
		
		System.out.println("--------------출력---------------");
		
		
		for(int i=1;i<=person;i++) {
			System.out.println(i+" 번 학생의 총점 : "+sum[i-1]+"점");
			System.out.println(i+" 번 학생의 평균 : "+String.format("%.2f", avg[i-1])+"점");
			//=>System.out.printf("\t%2.f\n",avg[i]);
			//소수점 2째짜리 까지만 평균 보여주자
			System.out.println("--------------------------------");
		}		
	}
}
	//학생의 수를 입력하세요 : 3
	//-----------점수 입력란------------------
	//1번 학생의 국어점수를 입력하세요 : 10
	//1번 학생의 수학점수를 입력하세요 : 13
	//1번 학생의 영어점수를 입력하세요 : 12
	//-------------------------------
	//2번 학생의 국어점수를 입력하세요 : 40
	//2번 학생의 수학점수를 입력하세요 : 50
	//2번 학생의 영어점수를 입력하세요 : 60
	//-------------------------------
	//3번 학생의 국어점수를 입력하세요 : 70
	//3번 학생의 수학점수를 입력하세요 : 80
	//3번 학생의 영어점수를 입력하세요 : 90
	//-------------------------------
	//--------------출력---------------
	//1 번 학생의 총점 : 12
	//1 번 학생의 평균 : 4.00
	//----------------------------------
	//2 번 학생의 총점 : 60
	//2 번 학생의 평균 : 20.00
	//----------------------------------
	//3 번 학생의 총점 : 90
	//3 번 학생의 평균 : 30.00
	//----------------------------------


