package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager { // 클래스 영역 시작

	public static void main(String[] args) { // 메소드 영역 끝
		Animal a[] = new Animal[5];
		
		for(int i = 0; i < a.length; i++) {
			int random = (int) (Math.random() * 100 + 1);
			if((random % 2) == 0) {
				a[i] = new Cat("나비", "러시안블루", "집 안", "회색");
			} else {
				a[i] = new Dog("흰둥이", "말티즈", 10);
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}
	} // main 영역 끝

} // 클래스 영역 끝
