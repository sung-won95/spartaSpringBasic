package minju;

public class Car {
    static Integer WHEEL_COUNT = 4;
    private String color;
    private String brand;
    private Integer maxSpeed;
    private Integer currentSpeed;
    private String fuel;

    public Car(String inputcolor) {
        color = inputcolor;
        currentSpeed = 0;
    }

    public String 무슨색차니() {
        return this.color;
    }

}
