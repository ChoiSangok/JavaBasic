package java13_io.InputStream;


import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {

   public static void main(String[] args) {
      
      InputStream is; //입력 객체
      is=System.in; //표준 입력
      
      try {
         System.out.print("입력하세요 : ");
         int in=is.read(); //1바이트 입력, 아스키코드 반환
         System.out.println(in);
         
         System.out.println("문자 : "+(char)in );
   
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   }
}





//+ InputStream 의 read 메소드
//
//- public abstract int read() throws IOException
//   입력스트림으로부터 1Byte를 읽어들인다
//
//   읽어들인 데이터의 ASCII CODE를 int형으로 반환한다
//
//   입력스트림에서 End Of Stream 을 만나면 -1을 반환한다
//
//   ** EOF, End Of File, End Of Stream
//   스트림의 끝( 중단지점 ), 파일의 끝
   

