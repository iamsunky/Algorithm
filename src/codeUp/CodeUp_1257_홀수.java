package codeUp;

import java.util.Scanner;

public class CodeUp_1257_Ȧ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ۼ��� ������ ���� �ԷµǸ� �� ������ Ȧ���� ����Ͻÿ�.

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
