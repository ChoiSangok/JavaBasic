package java04_control.extest;

import java.util.Scanner;

public class GcmLcm {
   public static void main(String[] args) {
      
//      - 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//       프로그램을 작성하라.
//         최소공배수 = 공배수 중에서 가장 작은 정수
//         최대공약수 = 공약수 중에서 절대치가 가장 큰 수
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println(" 두 수를 입력하시오: ");
      
      int num1=sc.nextInt(); //첫번째 수
      int num2=sc.nextInt(); //두번째 수 
      int tmp1; //약수 저장
      int tmp2; //약수 저장
      
      boolean lc;// 가장 작은 약수 저장
      
      for(tmp1=1;tmp1<=num1;tmp1++) {
         if(num1%tmp1==0) {
            System.out.print(tmp1+" ");
         }
         else {;}
      }
      System.out.println("");
      for(tmp2=1;tmp2<=num2;tmp2++) {
         if(num2%tmp2==0) {
            System.out.print(tmp2+" ");
         }
         else {;}
      }
      
      lc=tmp1==tmp2;
      
      
      if(true) {
         System.out.println(tmp1);
      }
      
      
      
      
   }
}
