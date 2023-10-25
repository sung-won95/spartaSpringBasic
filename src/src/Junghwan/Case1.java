package Junghwan;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        Scanner scanner = new Scanner(System.in);
        //여기에 작성해 주세요
        while (true){
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if ( randomNum < userInput){
                System.out.println("Down");
            } else if ( randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("Good");
                System.out.println("축하해용가륑");
                break;
            }
        }
    }
}


