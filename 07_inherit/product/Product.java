package java07_inherit.product;


public abstract class Product {
	
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		
		setModel(model);
		setPrice(price);

	}
//	-----Getter Setter ----
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void out();//추상화 문법ㅂ적으로 강제 하는 방벙
	//구현되지 않는 몸체 클래스도 추상화 되어야 하고
	//abstract 객체생성이 안된다
	
	
//	public void out() {
//		System.out.println("tv");
//		System.out.println("모델 : "+model);
//		System.out.println("가격 : "+price);
//		
//	}
}


