package siwon;

import java.util.Scanner;
import java.util.SortedMap;

public class Case1 {
    public void gameStart(int randomNum){

        Scanner scanner  = new Scanner(System.in);
        String string= "아직 못맞춤";

        int a=0;
        do{
            Integer userInput=Integer.parseInt(scanner.nextLine());


            if (randomNum < userInput) {
                System.out.println("down");

            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("good");
                string="굿";
            }

            //여기에 작성해 주세요

        }while (a<0);
    }


}


