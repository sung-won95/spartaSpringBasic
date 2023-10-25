package src.src.Hyeok;

import java.util.Scanner;

public class Funtions {


	public static int returnInt () {

		Scanner scanner = new Scanner(System.in);
		String userInput;
		int returnInt;

		while (true) {
			userInput = scanner.nextLine();
			try {
				returnInt = Integer.parseInt(userInput);
				if (0 < returnInt && returnInt < 1000) {
					return returnInt;
				}
				else {
					System.out.println("범위 내의 숫자만 입력해주세요.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}
}
