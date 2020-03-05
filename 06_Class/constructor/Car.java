package java06_class.constructor;

public class Car {
	
	private String model;
	private String color;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public Car(String mo, String co) {	//생성자 초기화 하는 리턴타입 없고~
		
		setModel(mo);
		setColor(co);
		
		
	}
	
	public void display() { //display 메소드
	
		System.out.println("모델 : " + getModel()); //get으로 불러드리는것
		
		System.out.println("색상 : " + getColor());
		

	}
	

	
	
}
