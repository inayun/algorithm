package problems;

import java.util.Scanner;

public class P10817 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		int min = scanner.nextInt();
		int mid = scanner.nextInt();
		int tmp;
		
		if(max > min) {
			
		} else {
			tmp = max;
			max = min;
			min = tmp;
		}
		if(max < mid) {
			tmp = max;
			max = mid;
			mid = tmp;
		} else {
			
			if(min > mid) { 
				tmp = min;
				min = mid;
				mid = tmp;
			} 
		}
		System.out.println(mid);
	}
}
