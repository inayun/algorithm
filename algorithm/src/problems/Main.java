package problems;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		/*
		다솜이는 은진이의 옆집에 새로 이사왔다. 
		다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

		다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 
		한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
		다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오. 
		(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
		
		첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.
		첫째 줄에 필요한 세트의 개수를 출력한다.
		
		*/
		String input;
		char roomNum[];
		int plastic[][] = new int[10][1]; //0~9까지의 각 숫자마다 2개의 배열이 있음 0(사용안됨),1(사용됨)
		int count;
	
		//todolist
		//모든 숫자마다 0으로 초기화하기
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();
		roomNum = new char[input.length()];
		
		for(int i = 0; i <roomNum.length; i++) {
			roomNum[i] = input.charAt(i);
			
			
		}
		
	
		
	} 
}
