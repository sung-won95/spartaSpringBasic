package junyeong;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            Integer userInput = Integer.parseInt(scanner.nextLine());

            if (randomNum < userInput) {
                System.out.println("DOWN!");
            } else if (randomNum > userInput) {
                System.out.println("UP!");
            } else {
                System.out.println("GOOD :)");
                break;
            }
        }

    }
}


