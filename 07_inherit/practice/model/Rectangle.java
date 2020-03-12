package java07_inherit.practice.model;


public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	
	//--constructor--
	public Rectangle() { //기본값 넣어주는 ㄱ코드
//		this(0,0,0,0); //있어도 없어도 똑같~
		
	}
	
	//x, y는 부모 생성자로 넘김
	public Rectangle(int x,int y,int width,int height) {
		super(x,y); //부모생성자
		setWidth(width);
		setHeight(height);
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
//	* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	public void draw() {
		System.out.println();
		System.out.print("좌표");
		super.draw();
		
		System.out.printf("면적 : %.1f\n",width*(double)height);
		System.out.printf("둘레 : %.1f\n",2*(width*(double)height));
		
	}
	
}









