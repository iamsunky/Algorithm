package codeUp;

import java.util.Scanner;

public class CodeUp_1257_홀수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시작수와 마지막 수가 입력되면 그 사이의 홀수를 출력하시오.

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
