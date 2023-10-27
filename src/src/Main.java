import younggyu.Car;
import younggyu.Case1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();


        Car blueCar = new Car("파란 차");
        Car blackCar = new Car("검정색 차");

        for(Integer i = 0; i < 10; i++){
            blueCar.가속하기();
        }


        carList.add(blueCar);
        carList.add(blackCar);

        for(Car car : carList){
            System.out.println(car.무슨색차니() +"색 차의 현재 속력은 : " + car.현재속력은());

        }
    }
}