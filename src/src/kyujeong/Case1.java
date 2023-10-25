package kyujeong;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        Scanner sc = new Scanner(System.in);

        int result;
        int checkNumber;
        while(true) {
            Integer userInput = Integer.parseInt(sc.nextLine());
            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else if (randomNum == userInput) {
                System.out.println("GOOD");
                break;
            }
        }
    }
}


