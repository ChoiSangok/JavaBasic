package java04_control.star;

public class Star_13 {
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=0; i<5 ; i++) { //quiz 
		      
			for(j=5;i<j;j--) {
				System.out.print("*");      
                              		  
			}                        	 
			System.out.println("");        
		}
	    for(i=0;i<5;i++) { 
	 		 
	     	for(j=-1;j<i;j++) {               
	     		System.out.print("*");        
	 		
	     	}
	     	System.out.println("*");      
	    }

	}

}
