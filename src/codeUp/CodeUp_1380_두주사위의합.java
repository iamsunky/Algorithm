package codeUp;

import java.util.Scanner;

public class CodeUp_1380_두주사위의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		
		for (int i = 1; i < 7; i++) {
			for (int j = 6; j > 0; j--) {
				if(i+j == k) {
					System.out.printf("%d %d\n", i, j);
					break;
				}
			}
		}
	}

}
