//문제)
/*
 * 가위(1), 바위(2), 보(3)
 * 컴퓨터는 임의의 숫자(1~3)을 제시하고
 * 사용자도 임의의 숫자 (1~3)을 제시한다.
 * 두 수를 비교해서 게임의 승자를 출력한다.
 * 
 * 출력예)
 * 컴퓨터가 제시한 숫자:??
 * 사용자가 제시한 숫자>1
 * 컴퓨터 : 가위(1), 사용자 : 가위(1) = 무승부
 * 컴퓨터가 제시한 숫자:??
 * 사용자가 제시한 숫자>2
 * 컴퓨터 : 가위(1), 사용자 : 가위(2) = 사용자승!
 * 컴퓨터가 제시한 숫자:??
 * 사용자가 제시한 숫자>3
 * 컴퓨터 : 가위(1), 사용자 : 가위(3) = 컴퓨터승!
 * 컴퓨터가 제시한 숫자:??
 * 사용자가 제시한 숫자>0
 * 프로그램 종료
 */
package javase_20190225;

import java.util.Scanner;

public class Program066_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int rd = (int) (Math.random() * 3) + 1;

			System.out.println("컴퓨터가 제시한 숫자 : ??");

			System.out.printf("사용자가 제시한 숫자 >");
			int a = sc.nextInt();
			


			if (a == 0) {
				System.out.println("프로그램종료");
				break;
			}

			// 가위(1), 바위(2), 보(3)
			
			if(rd == a) System.out.println("무승부");
			 
			else if (rd == 1) {
				if (a == 2)
					System.out.println("컴퓨터승!");
				else
					System.out.println("사용자승!");
			} else if (rd == 2) {
				if (a == 1)
					System.out.println("컴퓨터승!");
				
				else
					System.out.println("사용자승!");
			} else if (rd == 3) {
				if (a == 1)
					System.out.println("사용자승!");
				else
					System.out.println("컴퓨터승!");
				
			}

		}
		sc.close();

	}

}
