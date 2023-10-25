package jaehyun;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        //여기에 작성해 주세요
        Scanner sc = new Scanner(System.in);

        String string = "아직 못맞춤";


        int i=0;
        while (i==0) {

            Integer userInput = Integer.parseInt(sc.nextLine());

            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                i=999999999;
            }

        }
    }


}


