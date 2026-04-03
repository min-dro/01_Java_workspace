package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListGenericRun { // 클래스 영역 시작

	/*
	 * * 제네릭 (Generic, <E>)
	 * > <여기> 안에 어떠한 타입을 선언해 주어
	 * 	 Collection 에 담을 데이터의 타입을 픽스 시켜주는 역할
	 * 
	 * > 별도의 제네릭 제시 없이 컬렉션 객체를 생성하면 E == Object
	 * 	 다형성 때문에 해당 컬렉샨에 다양한 자식 타입의 객체들을 (데이터들을) 모두 저장 가능!!
	 * 
	 * > 별도의 제네릭 설정을 하게 되면 E == 해당타입
	 * 	 해당 타입의 값들만 담을 수 있도록 유도할 수 있다!! (마치 배열처럼)
	 * 예) <String> 으로 설정하면 E == String
	 * 	  <Music> 으로 설정하면 E == Music
	 * 
	 * * 제네릭을 설정하는 이유
	 * 1. 명시한 타입의 데이터만 저장 가능하도록 타입의 제한을 두기 위해서 (마치 배열처럼)
	 * 2. 컬렉션에 저장된 객체를 매번 꺼내서 사용할 때
	 * 	  매번 다형성에 의해 "형변환 "하는 절차를 줄이기 위해서 (코드가 깔끔)
	 * 
	 * * 제네릭 설정 시 주의사항
	 * > 반드시 "참조자료형" 타입만 기술 사능하다!!
	 * 예) <int> (X)	   --> <Integer> (O)
	 * 	  <double> (X) --> <Double> (O)
	 */
	
	public static void main(String[] args) { // main 영역 시작
		
		// ArrayList 객체 생성 시 제네릭 설정하기
		
		// ArrayList/* <Object> */ list = new ArrayList /* <Object> */ (3);
		// > 별도의 제네릭 설정을 안하면 기본적으로 Object 타입으로 설정됨!!
		
		// ArrayList<Music> list = new ArrayList<Music>(3);
		// > 내부적으로 Music 객체만 담을 수 있는 3칸짜리 배열이 만들어짐!!
		
		ArrayList<Music> list = new ArrayList<>(3);
		// > JDK 7 버전 부터 뒤쪽의 제네릭 타입은 명시 안해도 됨!!
		
		System.out.println(list); // []
		
		// E : Element (제네릭)
		// E == Music
		
		// 1. add(E e)
		list.add(new Music("BANG BANG", "아이브")); // [0]
		list.add(new Music("404 (New Era)", "키키")); // [1]
		list.add(new Music("Good Goodbye", "화사")); // [2]
		// list.add("끝");
		
		System.out.println(list);
		// > 이제는 해당 Music 타입만 취급할 수 있다!!
		
		// 2. add(int index, E e)
		list.add(1, new Music("Drowning", "WOODS"));
		
		System.out.println(list);
		
		// 3. set(int index, E e)
		list.set(0, new Music("타임캡슐", "다비치"));
		
		System.out.println(list);
		// > 추가할 때 뿐만 아니라 수정할 때에도 해당 타입의 값으로만 수정 가능!!
		
		// 4. remove(int index)
		list.remove(1);
		
		System.out.println(list);
		
		// 5. size()
		System.out.println("리스트에 담긴 데이터 수 : " + list.size()); // 3
		System.out.println("리스트의 마지막 인덱스 : " + (list.size() - 1)); // 2
		
		// 6. get(int index) : E
		
		// 제네릭 설정 전
		// Object obj = list.get(0);
		// Music m = (Music)list.get(0);
		// System.out.println(((Music)(list.get(0)).getTitle());
		
		// 제네릭 설정 후 - 다형성 적용할 필요가 없음!!
		// Object obj = list.get(0);
		// Music m = list.get(0);
		System.out.println(list.get(0).getTitle());
		
		System.out.println("---------------------");
		
		// 일반 for문
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		
		// 향상된 for문
		// for(변수선언문 : 배열명)
		// for(변수선언문 : 리스트명)
		for(Music m : list) {
			System.out.println(m.getTitle());
		}
		
		System.out.println("-----------------------");
		
		// 7. subList(int beginIndex, int endIndex) : List<Music>
		
		// 제네릭 설정 전
		// List /* <Object> */sub = list.subList(0, 2);
		
		// 제네릭 설정 후
		List<Music> sub = list.subList(0, 2);
		// > 부분 리스트 추출한 결과 또한 Music 만 담겨 있을 것!!
		
		System.out.println(sub);
		
		System.out.println("---------------------------");
		
		// 8.addAll(Collection c)
		list.addAll(sub);
		
		System.out.println(list);
		
		/*
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕");
		strList.add("하세요");
		list.addAll(strList);
		*/
		// > addAll 로 통째로 데이터를 추가할 경우에도 제네릭 타입을 고려해야함!!
		
		System.out.println("-------------------------------");
		
		// 9. isEmpty()
		System.out.println("리스트가 비어있습니까 : " + list.isEmpty()); // false
		
		// 10. clear()
		list.clear();
		
		System.out.println("리스트가 비어있습니까 : " + list.isEmpty()); // true
		System.out.println("size : " + list.size()); // 0
		
		// ArrayList<int> intList = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		
	}  // main 영역 끝

} // 클래스 영역 끝
