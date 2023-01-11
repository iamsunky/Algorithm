package SWEA;

import java.util.Scanner;

public class SWEA_2058_자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int sum = 0;
		int a;
		
		for (int i = 0; i < 4; i++) {
			a = N % 10;
			N = N / 10;
			sum += a;
		}
		
		System.out.println(sum);
		
	}

}
