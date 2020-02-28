package java05_array.copy;

public class ArrayCopy_02 {

   public static void main(String[] args) {
      
      //기본데이터타입 변수 복사하기
      
      int num1=100;
      int num2;
      
      num2=num1;
      
      //------------------------------------
      //배열 복사하기 (참조형 복사) 
      
      int[] arr1= {10,20,30};
      int[] arr2;
   
      //깊은 복사, Deep Copy
      // 참조 대상의 내용물 ( 실 데이터. 저장된 데이터)를
      // 새로운 공간에 복사하는 것
      
      // 1. 복사될 공간 확보(생성)
      
      arr2=new int[arr1.length];
      
      // 2. 데이터 복사 ( for문 이용)
      for(int i=0;i<arr2.length;i++) {
         arr2[i]=arr1[i];
      }
      

      System.out.println("--- 데이터 수정 전 ---");

      for(int i=0;i<arr1.length;i++) {
         System.out.println(arr1[i]+":"+arr2[i]);
      }
      
      arr1[1]=777; //num1aks
      arr2[2]=999; //1,2 둘 다 영향을 받음
      
      System.out.println("--- 데이터 수정 후 ---"); 

      for(int i=0;i<arr1.length;i++) {
         System.out.println(arr1[i]+":"+arr2[i]);
      }
      
      
   }

}
