package problems;

import java.util.Scanner;

public class P9498 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if(90<=N && N<=100) {
			System.out.println("A");
		}else if(80<=N && N<=89) {
			System.out.println("B");
		}else if(70<=N && N<=79) {
			System.out.println("C");
		}else if(60<=N && N<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
