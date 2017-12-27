package problems;

import java.util.Scanner;
public class P10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int num:arr) {
			if(num < x) {
				System.out.print(num + " ");
			}
		}
	}
} 

