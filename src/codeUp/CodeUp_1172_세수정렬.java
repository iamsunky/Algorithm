package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1172_세수정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
