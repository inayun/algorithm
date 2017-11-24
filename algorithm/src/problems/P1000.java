package problems;

import java.util.Scanner;

public class P1000 {
	
	/*	
	 * 두 수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 */	
	
	public static void main(String[] args) {
		
		int A,B;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		System.out.println(A+B);
		scanner.close();
	}
}



