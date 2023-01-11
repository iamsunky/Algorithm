package SWEA;

import java.util.Scanner;

public class SWAE_2072_홀수만더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[10];

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			int sum = 0;
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
				if(arr[j]%2!=0) {
					sum += arr[j];
				}
			}
			
			System.out.printf("#%d %d\n", i, sum);
			
		} // end of for
		
		
	} // end of main

} // end of class
