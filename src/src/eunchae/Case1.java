package eunchae;

import java.util.Scanner;

public class Case1 {
    public static void gameStart(int randomNum) {
        System.out.print("숫자 입력: ");
        Scanner scanner = new Scanner(System.in);

        Integer userInput = Integer.parseInt(scanner.next());

                if (randomNum < userInput) {
                    System.out.println("DOWN");
                    gameStart(randomNum);

                } else if (randomNum > userInput) {
                    System.out.println("UP");
                    gameStart(randomNum);

                } else {
                    System.out.println("GOOD");
                }

        }
    }
