import kyujeong.Case1;

public class Main {
    public static void main(String[] args) {
        Case1 case1 = new Case1();
        int randomNumber = (int)(Math.random() * 1001);
        case1.gameStart(randomNumber);
    }
}