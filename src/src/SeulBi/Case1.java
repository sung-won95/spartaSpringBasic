package SeulBi;

import java.util.Scanner;

public class Case1 {
    public void gameStart(int randomNum){

        int a = 0;
        while (a<10) {
            Scanner sc = new Scanner(System.in);
            // 래퍼 클래스
            // 기본형 변수를 사용, 다양한 메서드 사용 가능
            // 객체지향의 모습. 외부에서는 굳이 내부의 모습을 알지 않아도 된다.
            Integer userInput = Integer.parseInt(sc.nextLine());

            if (randomNum < userInput) {
                System.out.println("DOWN");
            } else if (randomNum > userInput) {
                System.out.println("UP");
            } else {
                System.out.println("GOOD");
                break;
            }

            a = a+1;
        }

//        for(1;2;3){
//            4
//        } 1(초기화) -> 2(조건 확인) -> 4(실행) -> 3(스텝)

    }


}


