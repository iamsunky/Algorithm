package codeUp;

import java.util.Scanner;

/*
 	2월이 29일까지 있는 해를 윤년이라고 한다.
	한 자연수를 입력받아서 윤년인지 아닌지를 판단하는 프로그램을 작성하시오.	
	단, 윤년은 다음과 같은 성질을 지닌다고 한다.
	(1) 400의 배수이면 무조건 윤년이다.
	(2) (1)이 아닌 수 중에 4의 배수이며, 100의 배수가 아니면 윤년이다. 
	입력받은 자연수가 윤년이라면 "Leap"를 아니라면 "Normal"을 출력한다.
 */
public class CodeUp_1166_윤년판별 {

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