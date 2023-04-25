package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
				
		
		int sum = x + y + z;
		double avg = (double) sum / 3;		// double 실수형
		
		
		// (정수) / (실수) = (실수)
		// (int) / (double) = (double)
		// 4byte    8byte
		// 일반적으로, 작은 타입과 큰 타입을 연산하면 연산결과는 큰 타입이 된다.
		
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
				
		sc.close();
		
	}
}
