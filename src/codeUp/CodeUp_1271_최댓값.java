package codeUp;

import java.util.Scanner;

public class CodeUp_1271_�ִ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է��� ���� n�� �Էµǰ� n���� �����Ͱ� �Էµȴ�.
		// �� n���� ������ �� �ִ��� ����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
