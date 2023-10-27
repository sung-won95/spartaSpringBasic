package junyeong;

public class Car {
    static Integer WHEEL_COUNT = 4;
    private String color;
    private String brand;
    private Integer maxSpeed;
    private Integer currentSpeed;
    private String fuel;

    public Car(String color){
        this.color = color;
        this.brand = "테슬라";
        this.maxSpeed = 250;
        this.fuel = "전기";
        currentSpeed = 0;
    }

    public Car(String color, String brand, Integer maxSpeed, String fuel) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
        currentSpeed = 0;
    }

    public void downSpeed() {
        this.currentSpeed -= 1;
    }

    public void upSpeed() {
        this.currentSpeed += 1;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getCurrentSpeed() {
        return this.currentSpeed;
    }

    public String brandColor() {
        return "브랜드는 " + this.brand + " 색은 " + this.color;
    }
}
