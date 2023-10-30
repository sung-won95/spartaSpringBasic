import base.Car;
import base.Case1;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Case1 case1 = new Case1();
//        case1.gameStart(3);


        List<Car> carList = new ArrayList<>();
        Car bluecar = new Car("파란 차");
        // 여기서 new Car 는 Car 클래스의 12번째줄의 생성자 Car를 따른다
        Car blackcar = new Car("검정색 차", "제네시스", 258, "가솔린");
        // 여기서 new Car 는 Car 클래스의 20번째줄의 생성자 Car를 따른다

//        for (Integer i = 0 ; i < 10 ; i ++) { // 범위형태로 list 만들수 있음, 이러면 더미 데이터로 들어감
//            carList.add(new Car("아무거나"));
//        }

        carList.add(bluecar); // carList 안에 bluecar를 넣어주는것, List안에 일일히 적어서 넣어주어야 한다.
        carList.add(blackcar);

//        for(Car car : carList) {
//            System.out.println(car.무슨색차니()); //
//            System.out.println(car.무슨브랜드와무슨색을가지고있니());
//        }


        for(Integer i = 0 ; i < 10 ; i++) {
            bluecar.가속하기();
        }



        for(Car car : carList) {
            System.out.println(car.무슨색차니() + " 현재 차의 속력은 " + car.현재속력은());
        }



    }
}