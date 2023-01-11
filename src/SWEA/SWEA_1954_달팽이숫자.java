package SWEA;

import java.util.Iterator;
import java.util.Scanner;

public class SWEA_1954_달팽이숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 4 direction
		int[] dr = { 0, 1, 0, -1 }; // row
		int[] dc = { 1, 0, -1, 0 }; // column

		int T = scanner.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			// N 입력 받아서 N*N의 2차원 배열틀 만들기
			int N = scanner.nextInt();
			int[][] arr = new int[N][N];

			// 현재 좌표(d), 시작행(r), 시작열(c)
			int d = 0;
			int r = 0;
			int c = 0;

			// 배열틀안에 반복문으로 1 ~ N 까지의 숫자 넣기
			for (int i = 1; i <= N * N; i++) {
				// [0,0] 부터 값을 넣기 시작하는데, 해당 위치에 값이 존재하는지 여부 & 배열을 벗어나는지 확인
				arr[r][c] = i;

				if (r + dr[d] >= N || r + dr[d] < 0 || c + dc[d] >= N || c + dc[d] < 0
						|| arr[r + dr[d]][c + dc[d]] != 0) {
					d = (d + 1) % 4;
				}
				r += dr[d];
				c += dc[d];
			}
			System.out.println("#" + tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}