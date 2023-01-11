package SWEA;

import java.util.Scanner;

public class SWEA_2070_크기비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 1; i <= T; i++) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if (a < b) {
				System.out.println("#" + i + " <");
			} else if (a > b) {
				System.out.println("#" + i + " >");
			} else if (a == b) {
				System.out.println("#" + i + " =");
			}
		}

	} // end of main

} // end of class
