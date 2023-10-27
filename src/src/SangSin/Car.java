package SangSin;

public class Car {
    static Integer WHEEL_COUNT = 4;


    private String color;
    private String brand;
    private Integer maxSpeed;
    private Integer currentSpeed;
    private String fuel;

    public Car(String color, String brand, Integer maxSpeed, String fuel){
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;

        currentSpeed = 0;    // 굳이 지금 받을 필요가 없으면 초기화 시켜두면 됨
    }

    public Car(){}

    public String whatIsUrCar(){
        return color+ ", " + brand +", "+ maxSpeed +"km/h, "+fuel;
    }

    public Integer accelerate(Integer speed) {
        currentSpeed += speed;
        if (currentSpeed > maxSpeed) {
            return currentSpeed = 1000;
        }else if(currentSpeed == maxSpeed){
            System.out.println("최고 속력입니다.");
            return currentSpeed;
        }
        return currentSpeed;
    }

    public Integer decelerate(Integer speed) {
        currentSpeed -= speed;
        if(currentSpeed < 0) {
            return currentSpeed = 0;
        }
        else if (currentSpeed == 0) {
            System.out.println("더 이상 감속할 수 없습니다.");
            return 0;
        }
        return currentSpeed;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
