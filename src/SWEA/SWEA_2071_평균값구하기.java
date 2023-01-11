package SWEA;

import java.util.Scanner;

public class SWEA_2071_평균값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[10];

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
				sum += arr[j];
			}

			avg = Math.round(sum / 10.0);
			System.out.printf("#%d %1.0f\n", i, avg);
		}
	}

}
