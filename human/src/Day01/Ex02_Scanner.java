package Day01;

import java.util.Scanner;

/**
 * 자바 기본 입출력
 * @author User
 *
 */
public class Ex02_Scanner {
	
	
	public static void main(String[] args) {
		// 객체 생성 - new
		// 클래스타입 클래스명 = new 클래스명 ();
		// 기본 입력 객체 - scanner
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		// 자료형 변수명;
		// 변수 선언 및 초기화
		// 자료형 변수명 =값;
		System.out.println("a : ");
		int a = sc.nextInt();
				
		//"문자열" : 문자열은 큰 따옴표로 표현한다.
		//문자열과 숫자 연결하기
		// : "문자열"+변수(숫자)
		// - 문자열과 숫자를+(문자열 연결 연산자)로 연결할수있다.
		// 이때, 숫자(int) 자료형이 문자열 자료형으로 변환되어 연결된다
		// "a : " + a
		// "a : " + "10" --> "a : 10"
		System.out.println("a : " + a);
		
		sc. close();
		
	}
}
