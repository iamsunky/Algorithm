import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 서로 다른 6개의 정수를 저장할 배열을 선언한다.
		int[] arr = new int[6];

		// 1 ~ 45 사이 임의의 정수를 만든다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			// 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다.
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}
		System.out.println("정렬 전 : " + Arrays.toString(arr));

		// 배열을 증가순으로 정렬한다.
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬 후 : " + Arrays.toString(arr));

	} // end of main

} // end of class