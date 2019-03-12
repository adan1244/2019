package javase_20190225;

import java.io.IOException;

/*
 * 프로그램명 : 외부 입력 Scanner 클래스
 * 작성자 : 정지윤
 * 작성일 : 20190225
 */
public class Program060_scan_next {

	public static void main(String[] args) throws IOException {
		// 외부 입력
		// 프로그램 실행 후에 외부에서 자료 입력 받는 행위
		// 콘솔, 윈도우, 웹, ...
		// 표준 입력 장치(키보드)를 통한 입력
		// System.in.read()
		// -> 예외 처리 필요
		
		/**단어 단위 입력**/
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//주의) 문장 처리는 안된다.
		//test sample, ENTER
		String a = sc.next();
		String b = sc.next();
		System.out.println(a);//test
		System.out.println(b);//sample
		System.out.printf("%s%n",a);
		
		//Scanner 객체 사용에 대한 마무리
		sc.close();
		
		

	}

}
