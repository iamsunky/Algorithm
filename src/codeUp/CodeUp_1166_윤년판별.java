package codeUp;

import java.util.Scanner;

/*
 	2���� 29�ϱ��� �ִ� �ظ� �����̶�� �Ѵ�.
	�� �ڿ����� �Է¹޾Ƽ� �������� �ƴ����� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.	
	��, ������ ������ ���� ������ ���Ѵٰ� �Ѵ�.
	(1) 400�� ����̸� ������ �����̴�.
	(2) (1)�� �ƴ� �� �߿� 4�� ����̸�, 100�� ����� �ƴϸ� �����̴�. 
	�Է¹��� �ڿ����� �����̶�� "Leap"�� �ƴ϶�� "Normal"�� ����Ѵ�.
 */
public class CodeUp_1166_�����Ǻ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();

		if (year % 400 == 0 || year % 400 != 0 && (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap");
		} else
			System.out.println("Normal");

	}

}