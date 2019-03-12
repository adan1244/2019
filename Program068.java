package javase_20190225;

import java.util.Scanner;

public class Program068 {

	/*
	 * 메인메뉴 구성 특정 범위의 메뉴를 번호로 표시하고, 사용자의 선택에 의해서 메뉴 실행하는 구조 주의)반복 실행 할 수 있다. 주의) 종료
	 * 메뉴(0)를 선택해서 프로그램 종료
	 */

	// 회원 정보 관리
	// 회원 정보 구성 - 이름, 전화번호, 이메일
	// 2차원 배열 저장소 운영
	// 1차원 배열 - 개개인의 회원 정보 저장하는 저장소
	// 2차원 배열 - 회원 정보 여러개를 저장하는 저장소
	// {"park","010-5678-5678","park@test.com"},
	// {"kim","010-1234-1234","kim@test.com"}, ...
	// 주의) 배열은 동일 자료형만 허용
	// 주의) 휘발성 자료

	/*
	 * --- 회원 정보 관리 --- 
	 * 1. 회원정보출력 2. 회원정보입력 
	 * 선택>1 ------------------------------
	 * 
	 */
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		// 초기값이 없는 2차원 배열 저장소 준비
		String[][] members = new String[10][];

		// 2차원 배열의 인덱싱을 위한 임시변수
		// x = 배열에 실제 채워진 인원수
		int x = 0;

		while (true) {

			System.out.println();

			System.out.println("--- 회원 정보 관리 ---");
			System.out.println("1. 회원정보출력 2. 회원정보입력");
			System.out.print("선택>");
			int a = sc.nextInt();

			sc.nextLine();

			if (a == 0)
				break;
			if (a == 1) {
				System.out.println("1. 회원정보출력");
				int len = x;
				
				System.out.println("-----------------------------------");
				System.out.println("   이름   /    전화번호    /   이메일");

				for (int a2 = 0; a2 < len; ++a2) {
					// 2차원 배열의 요소를 순차적 접근
					String[] member = members[a2];
					// 1차원 배열의 요소를 인덱스 지정 접근
					System.out.printf("%5s  %12s  %14s%n", member[0], member[1], member[2]);
				}

				System.out.println();
			} else if (a == 2) {
				System.out.println("2. 회원정보입력");

				// 문제) 회원 정보 입력 코드 구현
				String[] member = new String[3];
				System.out.print("이름>");
				member[0] =  sc.next();
				System.out.print("전화번호>");
				member[1] = sc.next();
				System.out.print("이메일>");
				member[2] = sc.next();

				System.out.print("회원정보를 입력할까요(0/1)?");
				int data4 = sc.nextInt();
				sc.nextLine();
				
				 if (data4 == 1) {

					members[x] = member;
					++x;
					System.out.println("회원정보가 등록되었습니다.");


				} else
					System.out.println("회원정보가 취소되었습니다.");

			} else
				System.out.println("저장소가 꽉찼습니다.");

		}
		sc.close();
		System.out.println("프로그램 종료");

	}
}
