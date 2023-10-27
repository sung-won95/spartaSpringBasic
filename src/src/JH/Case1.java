package JH;
import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        //여기에 작성해 주세요
        Scanner sc = new Scanner(System.in);
        while(true) {
            Integer userInput = Integer.parseInt(sc.nextLine());

            if (randomNum < userInput) {
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


