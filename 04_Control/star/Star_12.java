package java04_control.star;

public class Star_12 {
	public static void main(String[] args) {
		
		int i,j;
		
		
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		for(i=0; i<5 ; i++) { //quiz 
		      
			for(j=4;i<j;j--) {
				System.out.print("*");      
                              		  
			}                        	 
			System.out.println("");        
		}
		
		for(i=0;i<10;i++) {
			
			for(j=0;j<i;j++) {
			//	System.out.print("*");
			}
			System.out.println("*");
			
			
			if(i==4) {break;}
			
			
			
			for(j=9;i<j;j--) {
				System.out.print("*");
			}
			System.out.println("");
			
			
			
			
		
			
			
		}
		
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		
		
	}

}
