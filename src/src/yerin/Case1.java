package yerin;
//#1. 복습반 첫번째 문제풀이
import java.util.Scanner;

public class Case1 {

    public void gameStart(int randomNum) {
        randomNum = 35;
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);


        while (true) {

            Integer userInput = Integer.parseInt(scanner.nextLine());
            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");

            } else {
                System.out.println("GOOD!");
                break;
            }

            scanner.close();
        }
    }
}

