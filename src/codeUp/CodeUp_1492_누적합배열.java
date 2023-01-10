package codeUp;

import java.util.Scanner;

public class CodeUp_1492_누적합배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] sumArr = new int[n];
		sumArr[0] = arr[0];

		for (int i = 1; i < n; i++) {
			sumArr[i] = sumArr[i - 1] + arr[i];
		}

		for (int i = 0; i < sumArr.length; i++) {
			System.out.print(sumArr[i] + " ");
		}

	}

}
