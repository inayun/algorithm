package problems;

import java.util.Scanner;

public class P8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = 0;
		
		for(int i = 1; i <= N; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
