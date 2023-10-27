package minju;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum) {
        //int : 타입

        Scanner sc = new Scanner(System.in);
        //Wrpper 클래스: 코드가 작성되있음(1897줄) -> 객체 지향(외부에서 내부 구현 몰라도 된다!)

        //그냥 형변환하는 것 구현 하기 힘들기 때문에!
        //  user_input.floatValue();
        //  user_input.toString();
        String string = "아직 못맞춤";

        //string =="아직 못맞춤"   원래는 equals 사용해야하는데  == 도 가능하다!

        while (true) {
            Integer user_input = Integer.parseInt(sc.nextLine());
            if (randomNum < user_input) {
                System.out.println("DOWN");
            } else if (randomNum > user_input) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                break;
            }
        }
    }
}