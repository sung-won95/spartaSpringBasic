package junyeong;

public class Computer {
    private String color;
    private String brand;
    private boolean power;

    public Computer(String color, String brand) {
        this.brand = color;
        this.color = brand;
        this.power = false;
    }

    public void turnOnOff() {
        power = !power;
    }

    public boolean getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
