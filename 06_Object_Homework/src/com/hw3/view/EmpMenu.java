package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {
	private Scanner sc;
	
	public EmpMenu() {}
	
	public void mainMenu() {
		sc = new Scanner(System.in);
		Employee emp = null;
		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
		
			switch(num) {
				case 1:
					emp = inputEmployee();
					break;
				case 2:
					modifyEmployee(emp);
					break;
				case 3:
					emp = null;
					System.out.println("삭제되었습니다.");
					break;
				case 4:
					System.out.println(emp.information());
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				
			}
		}
	}
	
	public Employee inputEmployee() {
		
		Employee emp = new Employee();
		
		System.out.print("사원명을 입력하세요 : ");
		emp.setEmpName(sc.nextLine());
		
		System.out.print("부서명을 입력하세요 : ");
		emp.setDept(sc.nextLine());
		
		System.out.print("직급을 입력하세요 : ");
		emp.setJob(sc.nextLine());
		
		System.out.print("나이를 입력하세요 : ");
		emp.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.print("성별을 입력하세요 : ");
		emp.setGender(sc.next().charAt(0));
		sc.nextLine();
		
		System.out.print("급여를 입력하세요 : ");
		emp.setSalary(sc.nextInt());
		sc.nextLine();
		
		System.out.print("보너스포인트를 입력하세요 : ");
		emp.setBonusPoint(sc.nextDouble());
		sc.nextLine();
		
		System.out.print("전화번호를 입력하세요 : ");
		emp.setPhone(sc.nextLine());
		
		System.out.print("주소를 입력하세요 : ");
		emp.setAddress(sc.nextLine());
		
		return emp;
	}
	
	public void modifyEmployee(Employee emp) {
		while(true) {
			System.out.println("===== 사원 정보 수정 메뉴 =====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
		
			switch(num) {
				case 1:
					System.out.print("변경하고 싶은 이름을 입력하세요 : ");
					emp.setEmpName(sc.nextLine());
					System.out.println("변경 성공!");
					break;
				case 2:
					System.out.print("변경하고 싶은 급여를 입력하세요 : ");
					emp.setSalary(sc.nextInt());
					sc.nextLine();
					System.out.println("변경 성공!");
					break;
				case 3:
					System.out.print("변경하고 싶은 부서를 입력하세요 : ");
					emp.setDept(sc.nextLine());
					System.out.println("변경 성공!");
					break;
				case 4:
					System.out.print("변경하고 싶은 직급을 입력하세요 : ");
					emp.setJob(sc.nextLine());
					System.out.println("변경 성공!");
					break;
				case 9:
					return;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				
			}
		}
	}
}
