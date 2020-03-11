package java07_inherit.productEx;

import java07_inherit.product.Computer;

import java07_inherit.product.Product;
import java07_inherit.product.Tv;
import java07_inherit.person.*;
public class ProductEx {
	public static void main(String[] args) {
		
		
		System.out.println("---상속 전 테스트-----------------");
		Computer c1 = new Computer("i7", 1000);
		c1.out();
		
		Tv t1 = new Tv("Canvas", 800);
		t1.out();
		
		
		
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
		
		
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
		int count = 0; //++로 개수 추가적코드
		
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"개 물건 구입");
		
		
		
//		System.out.println("---Person------------");
//		
//		
//		Person p = new Person("Alice", 1000);
//		
//		Product prod1 = new Tv("LG", 500);
//		Product prod2 = new Computer("i5", 500);
////		
//		//
//		p.buy(prod1);
//		p.buy(prod2);
//		p.buy( new Computer("i5", 500) );
//		
//		p.sell(prod2);
//		p.sell(prod1);
//		p.sell(prod1);
//		
		
		
		System.out.println("-----Product 추상 클래스--------");
		//추상클래스는 객체생성불가 (인스턴스화 불가)
		
//		Product p1=new Product("data",123);
		
		Product p; //객체변수
		
		p=new Tv("d1",123);
		
	}
}


























