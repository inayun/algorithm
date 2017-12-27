package problems;

import java.util.Scanner;
public class P1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int originalInput = 0;
		int count = 0;
		int newNum = 0;
		int N = scanner.nextInt();
		int input = N;
		if(input<10) {
			input = Integer.parseInt("0") + input;
		}
		originalInput = input;
		outer : while(true) {
		newNum = 0;
		count++;
		if(input<10) {
			input = Integer.parseInt("0") + input;
		}
		int a = input / 10 ; 
		int tmp = input % 10; 
		int b = tmp / 1;
		int add = a + b;
		if(add < 10) {
		} else {
			add = add % 10;
			add = add / 1;
		}
		newNum = Integer.parseInt("" + b + add);
		if(originalInput == newNum) {
			System.out.println(count);
			break outer;
		} else {
			input = newNum;
		}
		}	
	}
} 



