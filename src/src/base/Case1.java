package base;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        //여기에 작성해 주세요
        Scanner scn = new Scanner(System.in);
        int userInput;
        int rightNum = 7;

        while(true){
            userInput = Integer.parseInt(scn.nextLine());
            if (rightNum > userInput ){
                System.out.println("UP");
            }else if (rightNum < userInput){
                System.out.println("DOWN");
            } else {
                System.out.println("GOOD");
                break;
            }
        }
    }
}


