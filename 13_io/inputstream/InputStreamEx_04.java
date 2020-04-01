package java13_io.InputStream;


import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_04 {

   public static void main(String[] args) {
      
      
   InputStream is= System.in; //표준 입력 객체
      
      byte[] b= new byte[1024]; //입력데이터의 임시 저장소
      int len=-1;// 입력받은 데이터의 길이
      int total=0; //입력한 데이터의 전체 길이
      
      
      
      StringBuilder sb= new StringBuilder(); //입력받은 데이터 저장소
      
      System.out.println("<< 입력 대기중 >>");
      
      
      try {
         while( (len = is.read(b,0,b.length)) != -1) {
            
            total += len; //전체 입력 길이 계산
            
            System.out.println("len : "+ len); //입력받은 길이
            
            String str= new String(b,0,len);
            System.out.println("str : "+str);
//            System.out.println("b : " + b);
            
            
            //new String(b) 로 변환하면 byte[] 에 모든 요소를 변환한다
            // 이 때 이전에 입력했던 데이터도 같이 변환해버린다
            // new String(b,0,len) 을 이용하여 입력한 길이만큼만
            // 변환하여 사용한다
            
         }
         
         
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      System.out.println(" 전체  : "+ total+" Byte입력완료");
      System.out.println("\n<< 입력 데이터 >>");
      System.out.println(sb);
   }

}


//
//- public int read(byte[] b, int offset, int len) throws IOException
//   입력스트림에서 최대 len 만큼 읽어들인다
//
//   읽어들인 데이터를 b배열의 offset 인덱스부터 기록한다
//
//   읽어들인 데이터의 길이를 int 형으로 반환
//
//   읽어들인 데이터가 없으면(EOF) -1을 반환
//
//   ** read(buf)
//   ** read(buf, 0, buf.length)
//   ** 위 두 코드의 동작은 똑같다
//
