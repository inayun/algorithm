package problems;

import java.util.Arrays;
import java.util.Scanner;
public class P2750 {
	public static void main(String[] args) {
		/*
		첫째 줄에 수의 개수 N(1<=N<=1,000)이 주어진다. 
		둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
		이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		*/
		
		int input;
		int number[];
		
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextInt();
		number = new int[input];
		
		for(int i = 0; i<number.length; i++) {
			number[i] = scanner.nextInt();
		}
		
		Arrays.sort(number);
		for(int num : number) {
			System.out.println(num);
		}
	} 
}
