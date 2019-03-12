/*
 * 프로그램명 : 구구단출력
 * 작성자 : 정지윤
 * 작성일 : 20190225
 */
package javase_20190225;

import java.util.Scanner;

public class Program064_gugudan {

	public static void main(String[] args) {
		// 구구단 출력
		// 사용자가 원하는 구구단을 선택해서 출력
		// 출력 예)
		/*
		 * 구구단 숫자(1~9)>5 ------5단----- 5 * 1 = 5 5 * 2 = 10 ... 5 * 9 = 45
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.print("구구단 숫자(1~9) > ");
			int x = sc.nextInt();
			// sc.nextInt();
			
			//무한 실행 중단
			if (x == 0)
				break;
			
			System.out.printf("----- %d단 -----\n", x);

			for (int a = 1; a < 10; a++) {
				System.out.printf("%d * %d = %d\n", x, a, (x * a));
			}
			System.out.println();

		}
		sc.close();
		System.out.println("프로그램 종료");

	}

}
