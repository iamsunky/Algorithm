package codeUp;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1095_√‚ºÆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);

	}

}
