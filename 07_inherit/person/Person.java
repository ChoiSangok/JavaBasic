//package java07_inherit.person;
//
//import java07_inherit.product.Computer;
//import java07_inherit.product.Product;
//
//public class Person {
//
//	private String name;
//	private int money;
//	
//	private Product[] prod= new Product[5];
//	private int cnt=0; //a물건산거 증가 코드
//	
//	
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMoney() {
//		return money;
//	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//	
//	
//	public Person(String na,int mo) { //생성자
//		
//		for(int i=0;i<prod.length;i++) {
//			prod[i]=new Product();
//			
//	
//		}
//		setMoney(mo);
//		setName(na);
//		
//	}
//	//팔고 //사는 코드
//	public void buy(Product prod) {
//		
//		int sum = 0;
//		
//		System.out.println("가지고있는 돈: "+" "+getMoney());
//		
//		sum=getMoney()-prod.getPrice(); //sum 계산
//		//sum=sum+prod.getPrice();//sell계산
//		
//		
//		if(sum>=0) { 
//			System.out.println("구매한 모델 : "+prod.getModel()+" 금액 :"+prod.getPrice()+
//				" 남은금액 :"+sum);
//			
//
//			setMoney(sum);
//		}
//		
//		else {System.out.println("잔액이 없습니다"); }
//		
//		
//	}
//
//	public void sell(Product prod) { //판매코드
//		
//		int sum=0;
//		
//		System.out.println("================");
//		System.out.println("가지고있는 돈: "+" "+getMoney());
//		sum=sum+prod.getPrice();//sell계산
//		
//		
//		setMoney(sum);
//		
//	}
//	
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
