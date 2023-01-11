package SWEA;

import java.util.Scanner;

public class SWEA_1209_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[100][100];
		
		for (int tc = 1; tc <= 10; tc++) {
			int T = scanner.nextInt();
			int sum = 0;
			int max = 0;

			// 배열
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}

			// 대각선(1)의 합
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][i];
			}

			if (max <= sum) {
				max = sum;
			}

			sum = 0;

			// 대각선(2)의 합
			for (int i = 99, j = 0; i >= 0; i--, j++) {
				sum += arr[j][i];
			}

			if (max <= sum) {
				max = sum;
			}

			sum = 0;

			// 행의 합
			for (int i = 0; i < arr.length; i++) {
				sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum += arr[i][j];
				}
				if (max <= sum) {
					max = sum;
				}
			}

			sum = 0;

			// 열의 합
			for (int j = 0; j < arr.length; j++) {
				sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i][j];
				}
//				max = Math.max(max, sum);
				if (max <= sum) {
					max = sum;
				}
			}

			System.out.printf("#%d %d", T, max);
			System.out.println();
			
		} // end of for

	} // end of main

} // end of class