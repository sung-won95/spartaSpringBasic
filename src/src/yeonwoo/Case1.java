package yeonwoo;

import java.util.Scanner;


public class Case1 {

    public void gameStart(int randomNum) {
        //여기에 작성해 주세요
        Scanner scanner = new Scanner(System.in);

        String string = "아직 못맞춤";

        int a = 0;
        for (; a < 10; a++) {
            Integer userInput = Integer.parseInt(scanner.nextLine());


            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                string = "이제 맞춤";
                break;
            }

        }


    }
}


