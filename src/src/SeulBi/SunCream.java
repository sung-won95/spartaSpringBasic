package SeulBi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SunCream {
    private String brand; // 회사 이름
    private String productName; // 상품 이름
    private Integer sunProtectionFactor = 50; // 자외선 차단 지수
    private String formulation; // 제형
    private Double millilitre; // 용량
    private Double remainingMillilitre; // 남은 양
    private final Integer effectTimeOfSPA = sunProtectionFactor*15; // 자외선 차단 지속 시간(분)
    private Integer price; // 가격
    private static final Double recommendMl = 0.8;

    private List<SunCream> basket = new ArrayList<>();

    SunCream(String brand, String productName){
        this.brand = brand;
        this.productName = productName;
        this.formulation = "무기자차";
        this.millilitre = 50.0;
        this.remainingMillilitre = this.millilitre;
        this.price = 8000;
    }

    SunCream(String brand, String productName, String formulation, Integer spf, Double millilitre, Integer price){
        this.brand = brand;
        this.productName = productName;
        this.formulation = formulation;
        this.sunProtectionFactor = spf;
        this.millilitre = millilitre;
        this.remainingMillilitre = this.millilitre;
        this.price = price;
    }

    public void buySunCream(){
        System.out.println("구매가 완료되었습니다.");
        System.out.println();
        System.out.println(brand + " 회사의 [" + productName +"] 상품을 선택하셨습니다.");
        System.out.println("제형은 " + formulation + "이며 자외선 차단 지수는 " + sunProtectionFactor+"입니다.");
        System.out.println("용량은 " + millilitre +"ml이고, 가격은 " + price + "원입니다." );
        System.out.println("----------------------------------------------------------");

        basket.add(new SunCream(brand, productName, formulation, sunProtectionFactor, millilitre, price));
    }

    public Double useSuncream(Double usingMillilitre){
        if(Objects.equals(remainingMillilitre,0.0)){
            System.out.println("남은 선크림이 없습니다. 새로운 선크림을 구입해 보세요!");
            System.out.println("----------------------------------------------------------");
        } else if (millilitre - usingMillilitre < 0.0){
            System.out.println("남은 용량보다 많은 양을 사용하실 수 없습니다.");
            System.out.println("----------------------------------------------------------");
        } else if(millilitre - usingMillilitre >= 0.0) {
            remainingMillilitre = millilitre - usingMillilitre;
            if(usingMillilitre < recommendMl){
                System.out.println("선크림을 " + usingMillilitre + "ml 사용하셨습니다.");
                System.out.println("성인의 선크림 권장 용량은 1회당 최소 " + recommendMl + "ml이므로 자외선 차단 시간 측정이 어렵습니다.");
                System.out.println("다음 번에는 권장 용량을 지켜 사용하시는 것을 추천드립니다.");
                System.out.println("남은 선크림 용량은 "+ remainingMillilitre+"ml입니다.");
                System.out.println("즐거운 외출 되세요!");
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("선크림을 " + usingMillilitre + "ml 사용하셨습니다.");
                System.out.println("자외선 차단 지속 시간은 " + effectTimeOfSPA + "분이며 남은 선크림 용량은 "+ remainingMillilitre+"ml입니다.");
                System.out.println("즐거운 외출 되세요!");
                System.out.println("----------------------------------------------------------");
            }
        }

        return remainingMillilitre;
    }

    public void checkSuncream(){
        System.out.println(productName + "의 자외선 차단 지수는 " + sunProtectionFactor + "이며 남은 용량은 " + remainingMillilitre + "ml입니다." );
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        // 메서드 확인용 객체 생성
        SunCream mySunCream1 = new SunCream("에뛰드","순정 선크림");
        SunCream mySunCream2 = new SunCream("라운드랩","자작나무 수분 선크림","무기자차",50,50.0,12000);

        mySunCream1.buySunCream();
        mySunCream2.buySunCream();

        mySunCream1.useSuncream(0.5);
        mySunCream2.useSuncream(50.0);

        mySunCream1.useSuncream(0.8);
        mySunCream2.useSuncream(1.0);

        mySunCream1.checkSuncream();


    }
}
