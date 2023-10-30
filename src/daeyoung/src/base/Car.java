package base;

public class Car {
    // 밑에 내용들은 Car라는 속성의 변수다
    static Integer WHEEL_COUNT = 4;
    private String color;
    private String brand;
    private Integer maxSpeed;
    private Integer currentSpeed;
    private String fuel;

    public Car(String inputcolor) {
        this.color = inputcolor;
        this.brand = "테슬라";
        this.maxSpeed = 250;
        this.fuel = "전기";
        this.currentSpeed = 0;
    }

    public Car(String inputcolor, String inputBrand, Integer inputmaxSpeed, String inputfuel) {
        this.color = inputcolor;
        this.brand = inputBrand;
        this.maxSpeed = inputmaxSpeed;
        this.fuel = inputfuel;
        this.currentSpeed = 0;
    }

    public String 무슨색차니(){
        return "색은 " + this.color;
    }

    public String 무슨브랜드와무슨색을가지고있니(){
        return "브랜드는 " + this.brand + " 색은 " + this.color;
    }

    public void 가속하기 () {
        this.currentSpeed += 1;
    }

    public void 감속하기 () {
        this.currentSpeed -= 1;
    }

    public Integer 현재속력은() {
        return this.currentSpeed;
    }


}
