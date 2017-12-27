package problems;

import java.util.Scanner;
public class P10797 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for(int i=0; i<5; i++) {
			int carNum = scanner.nextInt();
			if(carNum == n) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
} 
