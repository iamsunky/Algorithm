package SWEA;

import java.util.Scanner;

public class SWEA_2068_최대수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[10];
		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int max = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.printf("#%d %d\n", i, max);
		}

	} // end of main

} // end of class
