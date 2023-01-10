package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063_중간값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);

		int min = 0;
		int max = arr.length - 1;

		int answer = arr[(min + max) / 2];

		System.out.println(answer);

	}

}
