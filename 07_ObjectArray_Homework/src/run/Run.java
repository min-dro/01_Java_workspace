package run;

import java.util.Scanner;

import model.vo.Cat;
import model.vo.Dog;
import model.vo.Product;
import model.vo.Student;

public class Run { // 클래스 영역 시작

	public static void main(String[] args) { // main 영역 끝
		Product p[] = new Product[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("상품명 입력 : "); 
			String productName = sc.nextLine();
			
			System.out.print("가격 입력 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수량 입력 : ");
			int amount = sc.nextInt();
			sc.nextLine();
			
			p[count] = new Product(productName, price, amount);
			count++;
			
			System.out.print("계속 하시려면 아무키나 입력하세요.(아니라면 n을 입력하세요.) : ");
			String yn = sc.nextLine();
			if(yn.equals("n")) {
				break;
			}
		}
		int total = 0;
		for(int i = 0; i < count; i++) {
			System.out.println(p[i].information() + ", 제품 한 항목 당 가격 : " + (p[i].getPrice() * p[i].getAmount()) + "원");
			total += p[i].getPrice(); 
		}
		System.out.println("상품들의 총 가격 : " + total + "원");
		
		Student s[] = new Student[3];
		s[0] = new Student(3, 4, 1, "홍길동");
		s[1] = new Student(4, 3, 2, "유관순");
		s[2] = new Student(2, 7, 5, "윤봉길");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].information());
		}
		
		Cat c[] = new Cat[3];
		Dog d[] = new Dog[2];
		
		c[0] = new Cat("냐옹");
		c[1] = new Cat("꺄옹");
		c[2] = new Cat("댜옹");
		
		d[0] = new Dog("복실이", 3.4, 50.0);
		d[1] = new Dog("허스키", 10.3, 130.4);
		
		for(int i = 0; i < c.length; i++) {
			c[i].information();
		}
		
		System.out.println();
		
		for(int i = 0; i < d.length; i++) {
			d[i].information();
		}
		
	} // main 영역 시작

} // 클래스 영역 끝
