package java08_abstract.interfaceEx.quiz;

public class Taxi implements Fare {
	

	public void calc(int distance) {
																	//FEE랑 같음
		System.out.println(distance+"운행했을때 요금은 "+ (distance*Fare.FEE*2) 
				+ "원 입니다");
		
	}
}
