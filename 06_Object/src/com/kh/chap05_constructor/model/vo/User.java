package com.kh.chap05_constructor.model.vo;

// 현실세계의 회원 한명을 나타내는 VO 클래스
public class User { // 클래스 영역 시작

	// 필드부
	private String userId; // 회원아이디
	private String userPwd; // 회원비밀번호
	private String userName; // 회원명
	private int age; // 나이
	private char gender; // 성별
	
	// 생성자부
	// > "생성자" 들이 모여있는 "부"분
	
	/*
	 * * 생성자 (Constructor)
	 * 
	 * > 이름이 클래스명과 동일하고, 반환형이 없는 일종의 "메소드 같은 놈
	 * 	 객체가 생성될 때 (== new 구문이 실행될 때) "호출"되는 메소드
	 * 
	 * [ 표현법 ]
	 * public 클래스명(매개변수 => 생략가능) {
	 * 
	 * 			실행할코드;
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적 (기본생성자)
	 * 2. 객체를 생성하는것 뿐만 아니라 매개변수로 전달된 값을 곧바로 필드에 "초기화" 할 목적 (매개변수 생성자)
	 * 
	 * * 생성자 작성 시 주의사항
	 * 1. 이름이 반드시 클래스명과 동일해야함!!
	 * 2. 반환형이 존재하지 않는다. (메소드와 비슷하게 생기긴 함) - 주의
	 * 3. 한 클래스 내에 여러개 작성이 가능하나, 각 생성자마다 "매개변수"가 중복되면 안된다.
	 * 	 (원칙 상 한 클래스 내에 원래는 메소드명이 중복되면 안됨!! 생성자명도 마찬가지!!
	 * 	 - 하지만 이름이 동일한 메소드, 생성자들 끼리 매개변수가 다르다면 공존 가능!!)
	 * 4. 매개변수 생성자를 하나라도 명시하는 순간
	 * 	 JVM 이 자동으로 기본 생성자를 만들어 주지 않는다!!
	 * 	 (기본 생성자는 어찌되었든 간에 직접 작성하자)
	 */
	
	// 제일 기본적인 형태의 생성자를 만들어 보기 (매개변수 없이)
	// > "기본 생성자" : 매개변수가 없는 생성자
	public User() { // 생성자 영역 시작
		
		/*
		 * * 기본 생성자
		 * 
		 * > new 구문 뒤에서 호출하여
		 * 	 단지 객체를 생성할 목적 (Heap 영역에 공간 확보) 으로 쓰이는 생성자
		 * > 기본 생성자 안에는 코드를 굳이 쓰지 않음!!
		 * > 기본 생성자로 객페를 생성하면 각 필드에 타입 별 기본값이 담김
		 * > 기본 생성자는 작성을 생략하는 경우 오류가 나지 않고, 호출 또한 제대로 됨!!
		 * > 기본 생성자를 작성하지 않는 경우 JVM 이 자동으로
		 * 	 기본 생성자 코드를 만들어줬기 때문에 항상 사용 가능했던것!!
		 * > 단, 매개변수가 있는 생성자가 아래에 작성되어있을 경우
		 * 	 그 경우에는 기본생성자는 내가 직접 작성하는 습관을 들여주자!! 
		 */
		
		// System.out.println("잘 호출 되나?")
	} // 생성자 영역 끝
	
	// * 한 클래스 당 생성자를 여러개 둘 수 있다!!
	
	// 다소 복잡한 형태의 생성자를 만들어 보기 (매개변수를 추가)
	// > "매개변수 생성자" 또는 "매개변수가 있는 생성자"
	public User(String userId, String userPwd, String userName) { // 생성자 영역 시작
		
		/*
		 * * 매개변수 생성자
		 * 
		 * > new 구문 뒤에서 호출하여
		 * 	 객체를 생성함 (Heap 영역에 공간 확보) 과 동시에 내가 원하는 값으로 각 필드 값을 초기화할 목적으로 사용
		 * > 주로 매개변수로 전달받은 값을 각 필드에 대입하는 코드를 주로 작성 (setter 메소드 코드의 연장선)
		 * > 매개변수 한개 짜리, 두개 짜리, 새개 짜리, ..., 주로 필드의 갯수만큼 매개변수를 가진 생성자 까지 만든다.
		 */
		
		// System.out.println(userId);
		// System.out.println(userPwd);
		// System.out.println(userName);
		
		// 매개변수로 전달받은 값들을 각 필드에 넣어보기
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	} // 생성자 영역 끝
	
	// 필요하면 이 자리에 생성자 하나 더 추가 가능 (단, 매개변구다 중복되면 안됨)
	
	// 모든 필드에 대해 매개변수로 갖는 생성자 (즉, 매개변수 5개 짜리 생성자)
	public User(String userId, String userPwd, String userName, int age, char gender) { // 생성자 영역 시작
		
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// > 위의 코드는 사실 위의 매개변수 3개짜리 생성자의 코드랑 중복되는 코드임!!
		//	 매개변수 3개짜리 생성자를 호출해서 일일이 대입라는 구문을 생략하고 싶음!!
		
		// * 생성자를 메소드로써 호출하는 법
		// - 나와 같은 클래스의 생성자를 호출할 경우
		// [ 표현법 ]
		// this(인자값);
		// > this 생성자 (나와 같은 클래스의 생성자)
		
		this(userId, userPwd, userName);
		
		this.age = age;
		this.gender = gender;
		
		// this(userId, userPwd, userName);
		// > 단, 반드시 this 생성자를 호출할 때에는
		//	 해당 중괄호 영역 ({ 여기 }) 내 제일 최상단에 작성해야 한다!!
	} // 생성자 영역 끝
	
	// 메소드부
	// setter 5개
	public void setUserId(String userId) { // 메소드 영역 시작
		
		this.userId = userId;
	} // 메소드 영역 끝
	
	public void setUserPwd(String userPwd) { // 메소드 영역 시작
		
		this.userPwd = userPwd;
	} // 메소드 영역 끝
	
	public void setUserName(String userName) { // 메소드 영역 시작
		
		this.userName = userName;
	} // 메소드 영역 끝
	
	public void setAge(int age) { // 메소드 영역 시작
		
		this.age = age;
	} // 메소드 영역 끝
	
	public void setGender(char gender) { // 메소드 영역 시작
		
		this.gender = gender;
	} // 메소드 영역 끝
	
	// getter 5개
	public String getUserId() { // 메소드 영역 시작
		
		return userId;
	} // 메소드 영역 끝
	
	public String getUserPwd() { // 메소드 영역 시작
		
		return userPwd;
	} // 메소드 영역 끝
	
	public String getUserName() { // 메소드 영역 시작
		
		return userName;
	} // 메소드 영역 끝
	
	public int getAge() { // 메소드 영역 시작
		
		return age;
	} // 메소드 영역 끝
	
	public char getGender() { // 메소드 영역 시작
		
		return gender;
	} // 메소드 영역 끝
	
	// information - 모든 필드값들을 하나의 문자열로 연이어서 내보내는 메소드
	public String information() { // 메소드 영역 시작
		
		return "userId : " + userId + ", userPwd" + userPwd
				+ ", userName : " + userName + ", age : " + age
				+ ", gender : " + gender;
	} // 메소드 영역 끝
} // 클래스 영역 끝

/*
 * * 앞으로 VO 클래스를 작성 할 때에는
 * 1. 필드부 (private)
 * 2. 메소드부 (setter / getter, information)
 * 3. 생성자부 (기본생정사, 모든 필드에 대해 매개변수로 갖는 생성자)
 * => 작업 시작
 */