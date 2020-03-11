package java07_inherit.product;

public class Computer extends Product{

	//상속
	public Computer(String model, int price) {
		super(model,price);
	
		
	}

	@Override
	public void out() {
		
		System.out.println("COMPUTER");
		System.out.println("모델 : "+model);
		System.out.println("가격 : "+price);
	}

}
