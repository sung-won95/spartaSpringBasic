package woobin;
import java.util.Scanner;

public class Case1 {
    Scanner scanner = new Scanner(System.in);
    public void gameStart(int randomNum) {
        //여기에 작성해 주세요
        String string = "아직 못맞춤";
        while (string == "아직 못맞춤") {
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                string = "맞춤";
            }

        }
    }

}


