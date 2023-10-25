package Yurok;

import java.util.Scanner;

public class Case1 {

    public static void gameStart(int randomNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 맞춰보세요!");

        while (true) {
            System.out.print("입력: ");
            int userInput = Integer.parseInt(scanner.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("Up");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
