package java13_io.InputStream;


import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {

   public static void main(String[] args) {
      
      
      InputStream is= System.in; //표준입력객체
      
      int in=-1; //입력받은 데이터
      
      StringBuilder sb= new StringBuilder(); //입력받은 데이터 저장소
      
      try {
         //입력ㅂ다을 데이터가 남아 있으면 계속 반복
         while((in = is.read()) != -1 ) {
         
            //입력된 아스키코드를 문자로 변형하여 StringBuilder에 저장
            
            sb.append((char)in);
            
         }
         

         
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         
      } finally {
         
         try {
            if(is!=null) {is.close();} //close할려면 null검사하고 
                                 //close 은 finally 안에 try - catch 하고 다시
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } //스트림 닫기
         
         System.out.println("\n<< 입력결과 >>");
         System.out.println("sb : "+ sb);
         
         //키보드에서 EOF를 전송하기 위해서 ctrl+z를 사용한다
         
         //ctrl + z = EOF
         
      }// main end
      
      //에러사항 판단해서 코드 짜는게 가능해짐
      //그래서 기본값은 -1이 좋을거 같음
      
   }

}



