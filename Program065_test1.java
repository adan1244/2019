/*
 * 숫자 맞추기 (스무고개)
 * 컴퓨터가 제시하는 임의의 숫자(1~50) 를 특정
 * 
 * 출력예)
 * 
 * 컴퓨터가 제시한 숫자 : ??
 * 입력 1 : 50
 * 보다 작다
 * 입력 2 : 40
 * 보다 크다
 * 입력 3 : 45
 * 맞췄습니다.
 * 프로그램 종료
 */
package javase_20190225;

import java.util.Scanner;

public class Program065_test1 {
	// 컴퓨터가 임의의 난수 발생 -> Math.random()

	// 사용자 외부 입력 ->Scanner 클래스의 nextInt() 메소드

	// 임의의 난수와 사용자 입력한 수를 비교
	// 보다 작다, 보다 크다, 맞췄습니다
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int rd = (int) (Math.random() * 50) + 1;
			
			System.out.printf("컴퓨터가 제시한 숫자 : %d\n", rd);

			for (int x = 1; x <= 10; x++) {
				System.out.printf("입력 %d: ", x);
				int a = sc.nextInt();
				if (a == 0)
					break;
				if (x == 10) {
					System.out.println("더이상의 기회는 없습니다");
					break;

				}

				if (rd < a)
					System.out.println("보다 작다");

				else if (rd > a)
					System.out.println("보다 크다");

				else if (rd == a) {
					System.out.println("맞췄습니다!");
				}

			}
			sc.close();
			System.out.println("프로그램 종료");
		}

	}

}
