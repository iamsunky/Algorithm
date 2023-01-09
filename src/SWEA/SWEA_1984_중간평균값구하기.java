package SWEA;

import java.util.Scanner;

public class SWEA_1984_중간평균값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for (int tc = 1; tc <= count; tc++) {
			int sum = 0;
			int max = 0;
			int min = 10000;
			for (int i = 0; i < 10; i++) {
				int n = scanner.nextInt();
				if(n>max) { max = n; }
				if(n<min) { min = n; }
				sum += n;
			}
		System.out.printf("#%d %d\n", tc, Math.round((sum-max-min)/8.0));	
		}
	}
	
}