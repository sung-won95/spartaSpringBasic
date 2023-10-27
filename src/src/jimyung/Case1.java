package jimyung;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        //여기에 작성해 주세요
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer userInput = Integer.parseInt(scanner.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("Up");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}