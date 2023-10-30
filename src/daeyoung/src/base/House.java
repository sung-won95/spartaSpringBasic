package base;

public class House {

    static Integer Window = 5;
    private String Brand;
    private String Kind;
    private Integer Area;
    private Integer Floor;
    private Integer Elevator;

    public House(String inputBrand, String inputKind, Integer inputArea, Integer inputFloor) {
        this.Brand = inputBrand;
        this.Kind = inputKind;
        this.Area = inputArea;
        this.Floor = inputFloor;
        this.Elevator = 0;
    }

    public House(Integer inputArea) {
        this.Brand = "삼성";
        this.Kind = "아파트";
        this.Area = inputArea;
        this.Floor = 5;
        this.Elevator = 0;
    }

    public String 건물_브랜드가무엇이니() {
        return this.Brand;
    }

    public Integer 집면적이_얼마나되니() {
        return this.Area;
    }

    public Integer 이건물의_층수는() {
        return this.Floor;
    }

    public Integer 엘레베이터_현재위치는() {
        return this.Elevator;
    }

    public void 엘레베이터_올라가기() {
        this.Elevator += 1;
    }

    public void 엘레베이터_내려가기() {
        this.Elevator -= 1;
    }




}
