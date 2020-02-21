package java04_control.star;

public class Star_11 {
	
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=0;i<=5;i++) {
			for(j=5;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				} else {                     
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		//    *
		//   **
		//  ***
		// ****
		//*****
	}

}
