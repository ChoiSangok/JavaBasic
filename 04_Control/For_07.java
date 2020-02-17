package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		
		int coin=10; //처음 들어가는 코인
	
		int sumcoin=0;
		
		int day;	//15일 까지의 day 1일부터 15일까지
		
		for(day=0; day<15; day++) {	//15일동안 
			
			
			sumcoin+=coin;	//증가한 코인 더해주는 변수10 20 40 ...저장한거 입금
								
			coin=coin*2;	//2배로 증가	//다음날 저축
			
			//sumcoin+=coin;
			
			//1일 10 
			//2일 20 
			//3일 40
			//4일 

		}
		System.out.println("저축한 총 금액 : " + sumcoin+"원");
		
	}

}
