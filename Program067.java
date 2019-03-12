/*
 * 프로그램 명 : 메인메뉴 만들기
 * 작성자 : 정지윤
 * 작성일자 : 20190225
 */
package javase_20190225;

import java.util.Scanner;

public class Program067 {
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
	 * 
	 */
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 초기값이 들어 있는 2차원 배열 저장소 준비
		String[][] members = { { "park", "010-5678-5678", "park@test.com" }, { "kim", "010-1234-1234", "kim@test.com" },
				{ "hong", "010-1234-5678", "hong@test.com" }, { "lee", "010-8765-4321", "lee@test.com" } };
		
		while (true) {
			System.out.println();
			System.out.println("--- 회원 정보 관리 ---");
			System.out.println("1. 회원정보출력 2. 회원정보입력");
			int a = sc.nextInt();
			// sc.nextInt();

			if (a == 0)
				break;
			else if (a == 1) {
				System.out.println("1. 회원정보출력");
				
				int len = members.length;
				for(int x = 0;x<len;x++) {
					System.out.printf("%5s %12s %14s\n", members[x][0], members[x][1], members[x][2]);
				}
			} else if (a == 2) {
				System.out.println("2. 회원정보입력");
			}
		}
		sc.close();
		System.out.println("프로그램 종료");

	}

}
