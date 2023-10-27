package younggyu;

public class Car {
    static Integer WHEEL_COUNT = 4;
    private String color;
    private String brand;
    private Integer maxSpeed;
    private Integer currentSpeed;
    private String fuel;

    public Car(String inputColor){
        this.color = inputColor;
        this.brand = "테슬라";
        this.maxSpeed = 250;
        this.fuel = "전기";
        currentSpeed = 0;
    }

    public Car(String inputColor, String inputBrand, Integer maxSpeed, String fuel){
        this.color = inputColor;
        this.brand = inputBrand;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
        currentSpeed = 0;
    }

    public String 무슨색차니(){
        return this.color;
    }

    public String 무슨브랜드와무슨색을가지고있니(){
        return "브랜드는 " + this.brand + " 색은 " + this.color;
    }

    public void 가속하기() {
        this.currentSpeed += 1;
    }
    public void 감속하기() {
         this.currentSpeed -= 1;
    }
    public Integer 현재속력은(){
        return this.currentSpeed;
    }

}
