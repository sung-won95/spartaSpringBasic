package base;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        //여기에 작성해 주세요
        Scanner scanner = new Scanner(System.in);



        for ( ;; ){
            Integer userInput = Integer.parseInt(scanner.nextLine());

            if(randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                break;
            }
        }
    }


}


