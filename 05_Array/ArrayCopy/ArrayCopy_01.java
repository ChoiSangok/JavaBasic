package java05_array.copy;

public class ArrayCopy_01 {

   public static void main(String[] args) {
      
      //기본데이터타입 변수 복사하기
      
      int num1=100;
      int num2;
      
      num2=num1;
   
      //------------------------------------
      //배열 복사하기 (참조형 복사) 
      
      int[] arr1= {10,20,30};
      int[] arr2;
      
   
      //얕은 복사, shallow copy
      //참조 대상의 참조값 만 복사되는 현상
      // 생성된 데이터 저장공간은 복사되지 않는다.
      
      //참조형 변수를 단순히 대입했을 때 발생한다.
      
      
      arr2 = arr1;   //    복사
      
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


