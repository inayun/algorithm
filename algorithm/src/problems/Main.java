package problems;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		/*
		�ټ��̴� �������� ������ ���� �̻�Դ�. 
		�ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�.

		�ټ����� ���������� �ö�ƽ ���ڸ� �� ��Ʈ�� �Ǵ�. 
		�� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. 
		�ټ����� �� ��ȣ�� �־����� ��, �ʿ��� ��Ʈ�� ������ �ּҰ��� ����Ͻÿ�. 
		(6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)
		
		ù° �ٿ� �ټ����� �� ��ȣ N�� �־�����. N�� 1,000,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
		ù° �ٿ� �ʿ��� ��Ʈ�� ������ ����Ѵ�.
		
		*/
		String input;
		char roomNum[];
		int plastic[][] = new int[10][1]; //0~9������ �� ���ڸ��� 2���� �迭�� ���� 0(���ȵ�),1(����)
		int count;
	
		//todolist
		//��� ���ڸ��� 0���� �ʱ�ȭ�ϱ�
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.next();
		roomNum = new char[input.length()];
		
		for(int i = 0; i <roomNum.length; i++) {
			roomNum[i] = input.charAt(i);
			
			
		}
		
	
		
	} 
}
