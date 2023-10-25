package Hanshin;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        //여기에 작성해 주세요
        Scanner sc = new Scanner(System.in);
        String string = "아 아직이네";

        while (string == "아 아직이네") {
            Integer userInput = Integer.parseInt(sc.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("올ㅋ어케아셨데요!?");
                string = "팍!짝! 됬으!";
            }
        }
    }


}