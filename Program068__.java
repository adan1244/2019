package javase_20190225;

public class Program068__ {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[][] members = new String[10][];

		// 2차원 배열의 인덱싱을 위한 임시변수
		// ->배열 저장소에 채워진 실제 인원수
		int cnt = 0;

		while (true) {
			System.out.println();
			System.out.println("--- 회원 정보 관리 ---");
			System.out.println("1.회원정보출력  2.회원정보입력");
			System.out.print("선택>");
			int m = sc.nextInt();
			sc.nextLine();
			if (m == 0)
				break;
			if (m == 1) {
				System.out.println("1.회원정보출력");

			

				// length는 배열의 크기
				// int len = members.length;
				// cnt는 배열에 실제 채워진 인원수
				int len = cnt;

				System.out.println("------------------------");
				System.out.println("이름 / 전화번호 / 이메일");
				for (int a = 0; a < len; ++a) {
					// 2차원 배열의 요소를 순차적 접근
					String[] member = members[a];
					// 1차원 배열의 요소를 인덱스 지정 접근
					System.out.printf("%s / %s / %s%n", member[0], member[1], member[2]);
				}

			} else if (m == 2) {
				System.out.println("2.회원정보입력");

				// 문제) 회원정보입력 코드 구현

				// 이름, 전화번호, 이메일 외부 입력
				System.out.print("이름>");
				String name = sc.nextLine();
				System.out.print("전화번호>");
				String phone = sc.nextLine();
				System.out.print("이메일>");
				String email = sc.nextLine();

				System.out.println("회원정보를 입력할까요(0/1)?");
				int m_ = sc.nextInt();
				sc.nextLine();

				if (m_ == 1) {

					// 이름, 전화번호, 이메일 항목 저장용 1차원 배열
					String[] member = new String[3];
					member[0] = name;
					member[1] = phone;
					member[2] = email;

					// 2차원 배열에 1차원 배열 객체를 저장
					// 2차원 배열의 인덱스 범위는 0 ~ (배열의 크기 - 1)
					members[cnt] = member;
					++cnt;

					System.out.println("회원 정보가 등록되었습니다.");
				} else {
					System.out.println("회원 정보 등록이 취소되었습니다.");
				}

			}
		}

		sc.close();
		System.out.println("프로그램 종료");
	}
}
