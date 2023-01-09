package codeUp;

import java.util.Scanner;

public class CodeUp_1274_¼Ò¼ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		boolean prime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = true;
				break;
			}
		}

		if (prime) {
			System.out.println("prime");
		} else
			System.out.println("not prime");

	}

}
