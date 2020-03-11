package java07_inherit.product;


public class Tv extends Product{


	//상속
	public Tv(String model, int price) {
		super(model,price);
		

		
	}
	@Override
	public void out() {
		System.out.println("TV");
		System.out.println("모델 : "+model);
		System.out.println("가격 : "+price);
	}
}
