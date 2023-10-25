package src.src.Hyeok;

import java.util.Random;

public class Case1 {
    public void gameStart(){

        Random random = new Random();

        int randomNum = random.nextInt(0,100);

        System.out.println(" 랜덤한 숫자가 생성되었습니다. (0 ~ 100)");

        while (true) {

            System.out.println('\n' + " 맞출 숫자를 입력해주세요. ");

            int userInput = Funtions.returnInt();

            if ( userInput < randomNum )
                System.out.println("UP");
            else if ( userInput > randomNum )
                System.out.println("DOWN");
            else if ( userInput == randomNum ) {
                System.out.println("CORRECT!!");
                System.out.println("게임을 종료합니다.");
                break;
            }
        }



    }


}


