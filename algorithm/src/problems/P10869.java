package problems;

import java.util.Scanner;

public class P10869 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", A+B, A-B, A*B, A/B, A%B);
	}
}
