package SungHun;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        Scanner sc = new Scanner(System.in);

        String string = "아직 못 맞춤";
        while (string.equals("아직 못 맞춤")) {
            Integer userInput = Integer.parseInt(sc.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("Good");
                string = "이제 맞춤";
            }
        }
    }
}


