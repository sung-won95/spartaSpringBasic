package SeulBi;

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
        this.maxSpeed = 1;
        this.fuel = "전기";
        currentSpeed = 0;
    }

    public Car(String inputColor, String inputBrand, Integer maxSpeed, String fuel){
        this.color = inputColor;
        this.brand = inputBrand;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
        currentSpeed = 0; // 생성 시 굳이 필요 없는 것은 초기화하여도 됨
    }

    public String 무슨색차니(){
        return this.color;
    }

    public String 무슨브랜드와무슨색을가지고있니(){
        System.out.println("브랜드는 " + this.brand);
        System.out.println("색은 " + this.color +"입니다.");

        return this.color;
    }

    public Integer 가속하기(Integer plusSpeed){
        this.currentSpeed += plusSpeed;
        return currentSpeed;
    }

    public Integer 감속하기(Integer minusSpeed){
        if(this.currentSpeed <= 0){
            System.out.println("이미 속도가 0입니다.");
        } else { this.currentSpeed -= minusSpeed;}

        return currentSpeed;
    }
}
