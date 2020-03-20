package java10_collection.practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookManageMap{

//   - booksMap : HashMap   //도서번호를 키로 사용함
//
//   //기본생성자 : 맵 객체 생성함
//
//   //매개변수있는 생성자 : 다른 맵을 전달받아. 
//   //      booksMap 객체의 초기값으로 생성함
//
//   //Method
//   + putBook(book:Book) : void   //맵에 객체 추가, 도서번호를 키로 사용함
//   + removeBook(key:String) : void   //맵에서 객체 제거
//   + searchBook(String bTitle) : String   : entrySet() 사용
//      //도서명이 일치하는 객체의 도서번호를 리턴
//      //도서명이 객체가 맵에 없으면, null 리턴함
//   + displayAll():void      //맵정보 모두 출력 : keySet() 사용
//   + printBook(key:String) : void   //key에 해당하는 Book 출력

   private Map<String,Book> booksmap;

   
   
   
   Set entrySet = booksmap.entrySet(); //Entry(key-value쌍)들을 Set으로 추출
   
   public BookManageMap() { //기본생성자
      booksmap=new HashMap<>();
   }
   
   public BookManageMap(Map map) {
         
      
   }
   

   public void putBook(Book book) { //도서입력

      booksmap.put(book.getbNO(),book);

   }
   
   public void removeBook(String key) { //도서삭제
      
      booksmap.remove(key);

   }
   
   public String searchBook(String bTitle) { // 책이름
      
	   String bNO=null;
	   Set set=booksmap.keySet();
	   return bTitle;
      
   
   }
   public void displayAll() {

	  Set keySet = booksmap.keySet();
      
	  for(Object i:keySet) {
         System.out.println(booksmap.get(i).toString()); //key 값 
         
      }

   }
   public void printBook() {
      
    
//         System.out.println(booksmap.get(key));
     

   }
   
}
