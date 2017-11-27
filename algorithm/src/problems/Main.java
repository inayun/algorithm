package problems;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array[] = new String[100];
		
		for(int i = 0; i < 100; i ++) {
			String string = scanner.nextLine();
			array[i] = string;
		}
		
		for(String str:array) {
			System.out.println(str);
		}
		
	}
} 



