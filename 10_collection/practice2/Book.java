package java10_collection.practice2;

public class Book {


   //Field
//   - bNo : String      //도서번호
//   - category : int   //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
//   - title : String   //책제목
//   - author : String   //저자

   //기본생성자, 매개변수 있는 생성자, getters and setters 작성함
   //toString() 오버라이딩함
   
   private String bNO;
   private int category;
   private String title;
   private String author;
   
   
   public String getbNO() {
      return bNO;
   }
   public void setbNO(String bNO) {
      this.bNO = bNO;
   }
   public int getCategory() {
      return category;
   }
   public void setCategory(int category) {
      this.category = category;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getAuthor() {
      return author;
   }
   public void setAuthor(String author) {
      this.author = author;
   }
   
   public Book() { //기본생성자
   
   }
   
   public Book(String bNo, int category,String title,String author) { //매개변수있는 생성자
   
      setbNO(bNo);
      setAuthor(author);
      setCategory(category);
      setTitle(title);

   }
   
   //tostring오버ㅓㄹ아ㅣ딩
   
   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "도서번호 : "+getbNO()+" 카테고리 : "+getCategory()+" 도서이름 : "+getTitle()+" 저자 : "+getAuthor();
      
   }
   

}









