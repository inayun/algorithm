package problems;

import java.util.Scanner;

public class P2441 {
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i = 0; i <= N; i++) {
			
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for(int j = N-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
