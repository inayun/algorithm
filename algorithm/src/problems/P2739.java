package problems;

import java.util.Scanner;

public class P2739 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", N, i, N*i);
		}
	}
}
