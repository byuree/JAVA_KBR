package Day02;

public class Ex14_WhileSum {
	
	public static void main(String[] args) {
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+...+100 = 5050
		int sum = 0;
		int a = 1;
		
		while (a <= 100 ) {
			// 복합 대입 연산자, 증감연산자
			sum = sum + a;
			// sum += a++; ------> 최종 줄인 형태
			// sum += a;로도 쓸수있음
			
			// sum		sum 	a
			//	1		0 	+	1
			// 1+2		1	+	2
			// 1+2+3	1+2 + 	3 	... + 100
			a = a + 1; // 1 2 3     ...   100
	}	//  a++; 도 가능
		
		System.out.println("합계 : " + sum);
		
		
	}

}
