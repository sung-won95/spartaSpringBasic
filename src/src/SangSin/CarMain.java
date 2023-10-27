package SangSin;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
            List<Car> carList = new ArrayList<>();
            Car blueCar = new Car("blue","BBB", 1000, "Gasoline");
            Car blackCar = new Car("black","CCC", 500, "Gasoline");

            carList.add(blueCar);
            carList.add(blackCar);

            for (Car car : carList) {
                System.out.println(car.whatIsUrCar());
            }

            System.out.println(blueCar.accelerate(200) +" 엑셀엑셀엑셀엑셀" + " 현재 속력은 "+ blueCar.getCurrentSpeed()+"km/h 입니다. ");
            System.out.println(blueCar.accelerate(100) +" 엑셀엑셀엑셀엑셀" + " 현재 속력은 "+ blueCar.getCurrentSpeed()+"km/h 입니다. ");
            System.out.println(blueCar.decelerate(200) +" 브레이크브레이크" + " 현재 속력은 "+ blueCar.getCurrentSpeed()+"km/h 입니다. ");
            System.out.println(blueCar.decelerate(200) +" 브레이크브레이크" + " 현재 속력은 "+ blueCar.getCurrentSpeed()+"km/h 입니다. ");
    }
}

