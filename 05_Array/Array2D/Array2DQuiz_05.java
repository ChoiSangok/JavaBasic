package java05_array.array2D;

public class Array2DQuiz_05 { //달팽이 배열
   public static void main(String[] args) {
      
   
      
      int[][] ary=new int[5][5];
      
      
      int x=0, y=-1;
      int c=1;
      int t=1;
      int num=5; // 행.열을 5로 맞추고
      
      while(true) {
    	  for(int i=0;i<num;i++) {
    		  
    		  y=y+t;
    		  ary[x][y]=c; //00 01 02 03 04
    		  c++;
    	  }
    	  num--;
    	  if(num<0) {break;} //행열이 5이하면 멈춤 ㅠbreak
    	  
    	  
    	  for(int i=0;i<num;i++) {
    		  x=x+t;
    		  ary[x][y]=c;
    		  c++;
    		
    	  }
    	  t=-t;
      }

      
    
      
      for(int i=0;i<ary.length;i++) {
         for(int j=0;j<ary[i].length;j++) {
            System.out.print(ary[i][j]+"\t");
         }
         System.out.println();
      }
   }
}
   
