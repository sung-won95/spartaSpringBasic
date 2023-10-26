package hyeongwon;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        do {
            System.out.println("숫자를 예측하세요.");
            userInput = scanner.nextInt();
            if (randomNum < userInput) {
                System.out.println("DOWN");
                System.out.println("다시 입력하세요.");
            } else if (randomNum > userInput) {
                System.out.println("UP");
                System.out.println("다시 입력하세요.");
            }
            } while (userInput != randomNum) ;
            System.out.println("GOOD");
            System.out.println("정답입니다!");
        }
    }