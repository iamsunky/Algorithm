package codeUp;

import java.util.Scanner;

public class CodeUp_1259_¦�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� n������ �� �� ¦���� ���� ���Ͻÿ�.
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
