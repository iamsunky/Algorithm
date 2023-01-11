package SWEA;

import java.util.Iterator;
import java.util.Scanner;

public class SWEA_1954_�����̼��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 4 direction
		int[] dr = { 0, 1, 0, -1 }; // row
		int[] dc = { 1, 0, -1, 0 }; // column

		int T = scanner.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			// N �Է� �޾Ƽ� N*N�� 2���� �迭Ʋ �����
			int N = scanner.nextInt();
			int[][] arr = new int[N][N];

			// ���� ��ǥ(d), ������(r), ���ۿ�(c)
			int d = 0;
			int r = 0;
			int c = 0;

			// �迭Ʋ�ȿ� �ݺ������� 1 ~ N ������ ���� �ֱ�
			for (int i = 1; i <= N * N; i++) {
				// [0,0] ���� ���� �ֱ� �����ϴµ�, �ش� ��ġ�� ���� �����ϴ��� ���� & �迭�� ������� Ȯ��
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