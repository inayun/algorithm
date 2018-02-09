package problems;

import java.util.Scanner;
public class P8958 {
	public static void main(String[] args) {

		/*	
		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		예를 들어, 10번 문제의 점수는 3이 된다.

		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.*/

		Scanner scanner = new Scanner(System.in);
		int testCaseCount = scanner.nextInt(); //테이트케이스 개수
		int score = 0; //점수
		int temp = 0; //임시변수
		String str=""; //OX퀴즈 결과
		char[] letter = null; //OX결과 한문자씩 담아놓은 배열
		int[] scoreArr = new int[testCaseCount];
		
		for(int j = 0; j < testCaseCount; j++) {
			score = 0; 
			str = scanner.next();
			letter = new char[str.length()];

			for(int i = 0; i < str.length(); i++) {
				letter[i] = str.charAt(i);
				temp = i;

				if(letter[i]=='O') {
					//정답일때
					if(i==0) {
						score+=1;
					} else {
						score+=1;

						inner : while(temp-1 >= 0) {
							if(letter[temp-1]=='O') {
								score+=1;
								temp--;
							} else {
								break inner;
							}
						} //while
					}
				}
			} 
			scoreArr[j] = score;
		} //for
		for(int data : scoreArr) {
			System.out.println(data);
		}
		
	} 
}

