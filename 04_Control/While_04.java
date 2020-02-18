package java04_control.loop;

public class While_04 {

	public static void main(String[] args) {
		
		//continue, break; ->ㅣ기타 제어문
		
//		int i=0;//초기식 
//		
//		while(i<100) { 	//조건을 검사하면서 
//			
//			i++;
//			
//			if(i%2==0) {	//짝수일때만
//				continue;	//다음동작
//				
//			}
//			if(i>10) {
//				break;		//중단 
//			}
//			
//			System.out.println(i);
//		}
		
		
		for(int j=0;j<100;j++) {
			
			if(j%2==0) {	//짝수 continue~
				continue;
			}
			if(j>10) {	//10보다 크면 break;
				break;
				
			}
			System.out.println(j);
		}
	}

}
