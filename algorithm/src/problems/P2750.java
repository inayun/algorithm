package problems;

import java.util.Arrays;
import java.util.Scanner;
public class P2750 {
	public static void main(String[] args) {
		/*
		ù° �ٿ� ���� ���� N(1<=N<=1,000)�� �־�����. 
		��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
		�� ���� ���밪�� 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
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
