package com.kh.variable;

// 사용자가 키보드로 입력한 값을 변수에 담는 방법
import java.util.Scanner;

public class B_KeyboardInput { // 클래스 영역 시작

	public void InputTest1() { // 메소드 영역 시작
		
		/*
		 * * Scanner 
		 * > 사용자로부터 정수, 싱수, 문자열을 입력받을 수 있게끔 고안된 "클래스"
		 * 	 (이름이 대문자로 시작함)
		 * > 내가 만든 클래스가 아님!! 자바에서 기본적으로 제공해주는 클래스
		 * 
		 * 클래스는 패키지 안에 존재
		 * 
		 * java.util 패키지 안에 존재한다!!
		 * 즉, 풀글래스 명은 java.utill.Scanner 가 됨
		 */
		
		// * Scanner 클래스 내의 메소드를 사용하는 방법
		// > 즉, 다른 클래스의 메소드를 호출해서 쓰는 격이라서 Scanner 클래스를 대변할이름을 먼저 생성해야 함!!
		
		// 1. Scanner 클래스를 대변할이름 먼저 생성하기
		Scanner sc = new Scanner(System.in);
		// > System.in 은 키보드로 입력받은 값들을 byte 단위로 읽어들이겠다.
		//	 (참고로 출력문때는 System.out 이었음)
		
		// 2. 그 만들어진 대변할이름을 가지고 메소드 호출하기
		// sc.메소드명();
		// > Scanner 클래스 내부의 유용한 메소드들을 상황에 맞게 호출해서 쓰면 됨!!
		
		// 사용자의 인적사함 (이름, 나이, 키) 을 입력받아 출력하는 프로그램
		
		// 명심할 사항) 항상 입력받기 전에는 사용자의 입력을 제대로 유도하자!! 친절하게!!
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 이름 : "김기현", "홍길동", "박말순", ...
		// > 문자열 String 타입
		
		// * 사용자가 입역한 값을 문자열로 받아오는 메소드
		// next(), nextLine()
		
		// sc.next();
		// > 단 호출 구문만 작성한다면 키보드로 입력만 받고 끝남!!
		
		// 우리는 입역받은 값을 어딘가에 잘 보관해뒀다가 이따가 필요할 때 가져다 쓸 예점!!
		// > 그러기 위해서는 호출 구문과 변수 선언, 대입 구문을 총합해서 써야 함!!
		
		// String name = sc.next();
		// > 변수 선언과 동시에 값을 입력받아서 바로 대입한다.
		// > 사용자가 입력 후 엔터기를 치기 전까지는 무한 대기상태임!!
		
		// System.out.println(name);
		// > next() : 사용자가 입력한 값 중에서공백 (" ") 이전까지만 입역을 받아준다.
		// 예) "김 가현" 을 입력한 경우 "김" 만 입력됨!!
		
		String name = sc.nextLine();
		// > 사용자가 마찬가지로 입력 후 엔터키를 치기 전 까지는 무한 대기상태임!!
		
		// System.out.println(name);
		// > nextLine() : 사용자가 입력한 값 중 개행이 있을 경우 (엔터키를 칠 경우)
		//				  입력된 값 사이에 공백이 있든 없든 개행 이전까지 한줄 단위로 모두 입력을 받아준다.
		
		// 특히, 주소 같은 것들을 입역 받을 때에는 nextLine 이 더 유리함
		// "서울시 마포구 공덕동", "서울시 강남구 역삼동" 등
		// > 사용자가 입력할 값 중 공백이 포함될 여지가 있으면 무조건 nextLine
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		
		// 나이 : 20, 35,44, ...
		// > 정수 int 타입
		
		// * 사용자가 입력한 값을 정수 int 로 받아오는 메소드
		// nextInt()
		
		int age = sc.nextInt();
		// > 사용자가 엔터를 치기 전까지는 무한 대기상태
		
		// System.out.println(age);
		
		System.out.print("당신의 키는 몇 cm 입니까 : ");
		
		// 키 : 165.0, 182.5, ...
		// > 실수 double 타입
		
		// * 사용자가 입력한 값을 실수 double 로 받아오는 메소드
		// nextDouble()
		
		double height = sc.nextDouble();
		// > 입력 후 엔터키를 누르기 전까지는 무한 대기 상태
		
		// name, age, height 에 입력받은 값들이 이미 들어있으므로,
		// 이것들을 가지고 하나의 문자열로 입력 결과를 출력해보기!!
		
		// "xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다." 형식
		System.out.println(name + "님의 나이는 " + age + "살이고, 키는 " + height + "cm 입니다.");
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm 입니다.", name, age, height);
	
		// > Scanner 메소드들은 주로 변수 선언과 동시에 값을 입력받아 곧바로 대입하는 구조로 많이 쓴다!!
		
	} // 메소드 영역 끝
	
	// 2. 키보드로 값을 입력받을 떄 종종 발생되는 문제
	public void inputTest2() { // 메소드 영역 시작
		
		// 사용자의 인적사항 (이름, 나이, 주소, 키) 을 입역받아 출력하는 프로그램
		
		// Scanner 클래스를 대변할이름 먼저 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력유도 후 입력
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		// > 이 시점 기준으로 버퍼는 깨끗함
		
		System.out.print("나이를 압력하세요 : ");
		int age = sc.nextInt();
		// > 이 시점 기준으로 버퍼에 개햄문자 (\n) 가 남아있음!!
		
		// 다음 코드로 넘어가기 전에
		// 버퍼 이슈를 해결하기 위해 버ㅠㅓ 공간을 꺠긋하게 청소하고 넘어가자!!
		
		// * Scanner 에서 제동하는 버퍼를 비워주는 메소드
		// nextLine()
		sc.nextLine();
		// > 버퍼를 비워주는 용도로 쓰고 싶다면 변수 대입 구문은 빼고 입력
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		// > 어? 이미 입력을 하고 사용자가 엔터키를 친건가?
		//	 사용자가 키보드로 입력을 완료한걸로 간주해서 이슈가 발생한것!!
		//	 그래서 바로 아래의 코드로 흐름이 넘어가버린것
		// > 이 시점 기준으로 버퍼는 깨끗함
		System.out.print("키를 입력하세요 : ");
		Double height = sc.nextDouble();
		// > 사실 이 시점 기준으로도 버퍼에 개행문자가 남아있음!!
		
		sc.nextLine();
		
		/*
		 * nextLine 을 제외한 다른 입력용 메소드들은 모두 입력만 받고 버퍼 공간을 비워주지 않음!!
		 * > nextLine 을 제외한 다른 입력용 메소드들로 입력 받을 일이 있다면
		 * 	 혹시 모르니까 nextLine()을 추가하자
		 */
		
		// 위에서 입력받은 값들을 결과물로 출력 
		System.out.println("***" + name + "님의 개인정보***");
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + height);
		
	} // 메소드 영역 끝
	
	// 3. 그 이외의 타입의 값을 입력받는 방법
	public void inputTest3()  { // 메소드 영역 시작
		
		/*
		 * * Scanner 클래스에서 제공하는 키보드로 값을 입력받는 메소드들
		 * 
		 * 문자열을 입력받을 떄 : next(), nextLine()
		 * 정수값을 입력받을 떄 : nextInt(), nextByte(), nextShort(), nextLong()
		 * 실수값을 입력받을 떄 : nextDouble() , nextFloat()
		 * 논리값을 입력받을 떄 : nextBoolean()
		 * 
		 * 그럼 문자값을 입력받을 경우에는? nextChar()?
		 */
		
		// 사용자의 인적사항 (이름, 성별, 나이, 키) 을 입력받아서 출력하는 프로그램
		
		// Scanner 클래스를 대변할이름 먼저 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (M/F) : ");
		// String gender = sc.nextLine(); // "M"
		// > 사실문자열로 받아도 상관없긴함!!
		
		// 문자 타입으로 받아보자!!
		// char gender = sc.nextChar();
		// > nextChar 라는 메소드는 정의되어있지 않음
		
		/*
		 * "문자열은 문자들이 나열된 형태임!!"
		 * 
		 * * 문자열의 index 개념
		 * index : 색인, 번호, 순번 이런 뜻
		 * 
		 * 예) "apple" 이라는 문자열의 인텍스
		 * 	   01234
		 * > 문자열에서 0부터 시작하는 각 글자의 자릿수
		 * 
		 * "hello" 라는 문자열의 2번 인덱스의 문자는? '1'
		 * 01234
		 * 
		 * "Male" 이라눈 문자열의 0번 인덱스의 문자는 'M'
		 * 0123
		 * 
		 * "Female" 이라는 문자열의 0번 인덱스의 문자는? 'F'
		 * 012345
		 * 
		 * * 어떤 문자열로부터 X 번쨰 인덱스의 문자를 뽑아내는 메소드
		 * [ 표현법 ]
		 * 문자열.charAt(뽑을위치값);
		 */
		
		char gender = sc.nextLine().charAt(0);
		// > 우선 문자열로 입력받은 후 곧바로 0번쨰만 뽑아낸 것
		
		// System.out.println(gender); // 'M' / 'F'
		
		// 숙제 : 나이랑 키 마저 입력해서 name, gender, age, height 출력
		// ~~ 
		/***if(gender == 'M') {
			gender = '남';
		} else if(gender == 'F') {
			gender = '여';
		}***/
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요 (cm) : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		// 최종결과 출력
		// "xxx님의 성별은 x이며 나이는 x살이고, 키는 xxx.xcm 입니다." 형식
		System.out.println(name + "님의 성별은 " + gender + "이며 나이는 " 
								+ age + "살이고, 키는 " + height + "cm 입니다.");
		
		// printf 버전으로 변경
		System.out.printf("%s님의 성별은 %C이며 나이는 %d살이고, 키는 %.1fcm 입니다.\n", name, gender, age, height);
		
	} // 메소드 영업 끝

	// 4. charAt 연습
	public void inputTest4() { // 메소드 영역 시작
		
		/*
		 * 사용자로부터 세 글자 이상의 문자열을 입력받고
		 * 그 입력받은 문자열로 부터 각각 첫번째, 두번째, 세번째 글자를 뽑아서 출력하기
		 * 
		 * ---- 실행 예시 ----
		 * 세 글자 이상의 문자열을 입력하세요 : hello
		 * 
		 * 첫번째 글자 : h
		 * 두번째 글자 : e
		 * 세번째 글자 : l
		 */
		
		// Scanner 클래스를 대변할이름 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력 유도 후 입력받기
		System.out.print("세 글자 이상의 문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// 첫번째 글자 뽑기
		// > 사람 눈에는 1번 글자지만, 컴퓨터 임장에서는 0번 글자가 첫번째 글자
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		System.out.println();
		System.out.println("첫번째 글자 : " + first);
		System.out.println("두번째 글자 : " + second);
		System.out.println("세번째 글자 : " + third);
		/*
		 * * 이 프로그램 동작 중 세 글자 미만의 문자열을 사용자가 입력한다면?
		 * 
		 * > StringIndexOutOfBoundsException 오류가 발생함!!
		 * 	 (Index 2 out of bounds for length 2)
		 * 
		 * - 만약 문자열의 글자수 보다 더 범위가 큰 인덱스 값을 charAt(여기) 안에 제시한다면
		 * 	 StringIndexOutOfBoundsException 오류가 발생함
		 * 	 "너 왜 2글자리 문자열에서 2번 인덱스 글자가 없는데 왜 뽑으려고 함?"
		 * - 항상 범위에 맞는 인덱스를 제시할 수 있도록 신경쓰자!!
		 */
		
	} // 메소드 영역 끝
	
	// 5. 연습문제
	public void inputTest5() { // 메소드 영역 시작
		
		/*
		 * 두 정수를 키보드로 입력받아,
		 * 각각 그 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 출력하기
		 * 
		 * ---- 실행 예시 ----
		 * 첫번째 정수 : 10
		 * 두번째 정수 : 2
		 * 
		 * -----------------
		 * 덧셈결과 : 12
		 * 뺄셈결과 : 8
		 * 곱셈결과 : 20
		 * 나눗셈결과 : 5
		 * 
		 * 힌트) 덧셈 : +, 뺄셈 : -, 곱셉 : *, 나눗셈 : /
		 */
		
		// Scanner 클래스에 대변할이름 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력 유도 후 입력받기
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 각 연산 결과 출력
		System.out.println();
		System.out.println("-----------------");
		
		System.out.println("덧셈결과 : " + (num1 + num2));
		System.out.println("뺄셈결과 : " + (num1 - num2));
		System.out.println("곱셈결과 : " + (num1 * num2));
		System.out.println("나눗셈결과 : " + (num1 / num2));
		
	} // 메소드 영역 끝
	
} // 클래스 영역 끝
