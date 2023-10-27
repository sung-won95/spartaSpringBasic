package jeonguk;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Case1 {

    public void gameStart(int randomNum) {
        // 여기에 작성해주세요
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("숫자를 입력하세요 : ");
            Integer yournumber = Integer.parseInt(scanner.nextLine());
            if(randomNum > yournumber){
                System.out.println("UP!!");
            } else if (randomNum < yournumber){
                System.out.println("DOWN!!");
            }else{
                System.out.println("GOOD!!");
                break;
            }
        }

    }
}
