package jimyung;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer userInput = Integer.parseInt(scanner.nextLine());

            if (randomNum < userInput) {
                System.out.println("Down");
            } else if (randomNum > userInput){
                System.out.println("Up");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}


