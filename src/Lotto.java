import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �ٸ� 6���� ������ ������ �迭�� �����Ѵ�.
		int[] arr = new int[6];

		// 1 ~ 45 ���� ������ ������ �����.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			// ���� ������ �迭�� ���Ե� ������ Ȯ���ϰ� ���Ե��� ���� ������ �迭�� �����Ѵ�.
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		System.out.println("���� �� : " + Arrays.toString(arr));

		// �迭�� ���������� �����Ѵ�.
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("���� �� : " + Arrays.toString(arr));

	} // end of main

} // end of class