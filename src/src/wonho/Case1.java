package wonho;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){

        Scanner scanner = new Scanner(System.in);

        String string = "아직 못맞춤";

        while (string == "아직 못맞춤") {
            System.out.print("0부터 100까지의 숫자를 입력하세요: ");
            Integer answer = Integer.parseInt(scanner.nextLine());
            if (answer < randomNum) {
                System.out.println("UP");
            } else if (answer > randomNum) {
                System.out.println("Down");
            } else {
                System.out.println("정답입니다~~~~~~~");
                string = "이제 맞춤";
            }
        }
        //여기에 작성해 주세요

    }


}


