package java04_control.loop;

public class For_09 {

	public static void main(String[] args) {
		//for중첩
		
		for (int i =0;i<3;i++) { //for i 0 1 2
			for(int j=0;j<3;j++) {	//for j 0 1 2
				System.out.println("i : " +i+ ",j : " +j);
			}
			System.out.println("==============");
		}
		
		
		//반복문 중첩 시 고려사항
		//바깥쪽 loop의 반복자 의 진행에 맞춰서
		// 안쪽 loop의 반복자가 진행되는 과정을 생각해야 한다.
		//바깥쪽 안쪽 두 반복문이 받는 영향을 고려해야한다.
		
		
		
	}

}
