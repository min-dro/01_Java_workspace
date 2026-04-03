package practice1.model.vo;

public class Dog extends Animal {

	// 필드부
	public static final String PLACE =  "애견카페";
	private int weight;
	
	// 생성자부
	public Dog() {
		super();
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	// 메소드부
	
	public int getWeight() { // 메소드 영역 시작
		return weight;
	} // 메소드 영역 끝

	public void setWeight(int weight) { // 메소드 영역 시작
		this.weight = weight;
	} // 메소드 영역 끝

	@Override
	public void speak() { // 메소드 영역 시작
		System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
	} // 메소드 영역 끝

}
