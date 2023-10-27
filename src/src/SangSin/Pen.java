package SangSin;

public class Pen {

    boolean penCap = false;

    private String color;

    private Integer penNib;

    public Pen(String color, Integer penNib) {
        this.color = color;
        this.penNib = penNib;
    }

    public void knockPenCap(){
        penCap = !penCap;
        if(penCap){
            System.out.println("펜 뚜껑이 열렸습니다.");
        }else {
            System.out.println("펜 뚜껑이 닫혔습니다.");
        }
    }

    public void write(){
        if (penCap) {
            System.out.println("낙서 낙서 낙서 낙서 낙서 낙서 낙서 낙서");
            System.out.println("잘 나오는 펜");
        }else System.out.println("안 나오는 펜");
    }
}
