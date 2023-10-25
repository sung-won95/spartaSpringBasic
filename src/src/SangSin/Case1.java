package SangSin;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            Integer userInput = Integer.parseInt(scanner.nextLine());

            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("정답");
                break;
            }
        }
        scanner.close();
    }

}


