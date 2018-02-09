package problems;

import java.util.Scanner;
public class P8958 {
	public static void main(String[] args) {

		/*	
		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
		O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
		������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
		���� ���, 10�� ������ ������ 3�� �ȴ�.

		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

		Scanner scanner = new Scanner(System.in);
		int testCaseCount = scanner.nextInt(); //����Ʈ���̽� ����
		int score = 0; //����
		int temp = 0; //�ӽú���
		String str=""; //OX���� ���
		char[] letter = null; //OX��� �ѹ��ھ� ��Ƴ��� �迭
		int[] scoreArr = new int[testCaseCount];
		
		for(int j = 0; j < testCaseCount; j++) {
			score = 0; 
			str = scanner.next();
			letter = new char[str.length()];

			for(int i = 0; i < str.length(); i++) {
				letter[i] = str.charAt(i);
				temp = i;

				if(letter[i]=='O') {
					//�����϶�
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

