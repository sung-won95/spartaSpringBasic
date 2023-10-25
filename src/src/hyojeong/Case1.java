package hyojeong;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        // 숫자 맞추기 게임
        Scanner scan = new Scanner(System.in);

        while (true) {
            Integer userInput = Integer.parseInt(scan.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput) {
                System.out.println("Up");
            } else {
                System.out.println("Good");
                break;
            }
        }

        scan.close();
    }


}


