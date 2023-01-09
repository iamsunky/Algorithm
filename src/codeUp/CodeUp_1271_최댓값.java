package codeUp;

import java.util.Scanner;

public class CodeUp_1271_최댓값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력의 개수 n이 입력되고 n개의 데이터가 입력된다.
		// 이 n개의 데이터 중 최댓값을 출력한다.

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
