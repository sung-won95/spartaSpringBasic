package younggyu;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        Scanner scanner = new Scanner(System.in);

        String string = "아직 못맞춤";

        // 여기에 작성해 주세요

        while(true) {
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if(randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                break;
            }
        }
    }
}
