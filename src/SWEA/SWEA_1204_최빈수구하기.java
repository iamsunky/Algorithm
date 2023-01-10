package SWEA;

import java.util.Scanner;

public class SWEA_1204_최빈수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 테스트 케이스 수
		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			// 테스트 케이스 번호
			int Tnum = scanner.nextInt();
			int[] arr = new int[101];

			for (int j = 0; j < 1000; j++) {
				arr[scanner.nextInt()]++;
			}

			int max = 0;
			int idx = 0;

			for (int j = 0; j < 101; j++) {
				if (arr[j] >= max) {
					max = arr[j];
					idx = j;
				}
			}

			System.out.printf("#%d %d", Tnum, idx);
			System.out.println();
		}

	}

}