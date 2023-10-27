package hangsik;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){
        //여기에 작성해 주세요
        Scanner scanner = new Scanner(System.in);

        int a = 0;
       for (;a<10;){
            Integer userInput = Integer.parseInt(scanner.nextLine());
            if(randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                break;
            }
            a = a+1;
        }

//       for(1;2;3){
//           4
//       }
//       1 > 2 확인 > 4 > 3 > 2확인
    }
}


