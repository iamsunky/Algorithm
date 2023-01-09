package SWEA;

import java.util.Scanner;

public class SWEA_1966_숫자정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			System.out.printf("#%d ", t);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		
	} // end of main
	
} // end of class