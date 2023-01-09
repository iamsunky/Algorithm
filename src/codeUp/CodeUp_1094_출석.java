package codeUp;

import java.util.Scanner;

public class CodeUp_1094_√‚ºÆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] newArr = new int[n];
		for (int i = 0; i < n; i++) {
			newArr[n - 1 - i] = arr[i];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(newArr[i] + " ");
		}

	}

}
